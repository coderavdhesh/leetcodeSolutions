class Solution {
    public int pivotIndex(int[] nums) {

        int totalsum = 0;
        for(int ele : nums)
            totalsum += ele;
        
        int leftsum = 0;
        
        for(int i =0; i<nums.length; i++)
        {
            totalsum -= nums[i];// behave like a rightsum
            if(leftsum == totalsum)
                return i;
            leftsum += nums[i];// the left sum
            
        }
        
        return -1;
    }
}