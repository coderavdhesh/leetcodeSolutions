class Solution {
    public int findMiddleIndex(int[] nums) {
        
        if(nums.length == 1)
            return 0;
        
        int totalsum = 0;
        for(int num : nums)
        {
            totalsum += num ;
        }
        
        int leftsum =0;
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