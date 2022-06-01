class Solution {
    public int[] runningSum(int[] nums) {
        
        int PrefixSum = 0;
        
        for(int i =0 ;i<nums.length; i++)
        {
            PrefixSum += nums[i];
            nums[i] = PrefixSum;
        }
        
        return nums;
    }
}