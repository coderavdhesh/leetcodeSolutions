class Solution {
    public int minOperations(int[] nums) {
        
        int ops = 0;
        
        for(int i = 1; i< nums.length; i++){
            if(nums[i-1] >= nums[i])
            {
                int temp = nums[i-1] - nums[i] + 1;
                ops+=temp;
                nums[i] += temp; 
            }
        }
        
        return ops;
    }
}