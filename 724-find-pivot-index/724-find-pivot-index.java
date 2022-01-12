class Solution {
    public int pivotIndex(int[] nums) {

        int totalsum = 0;
        for(int ele : nums)
            totalsum += ele;
        
        int leftsum = 0;
        int rightsum = totalsum;
        
        for(int i =0; i<nums.length; i++)
        {
            rightsum -= nums[i];
            if(leftsum == rightsum)
                return i;
            leftsum += nums[i];
            
        }
        
        return -1;
    }
}