class Solution {
    public int minStartValue(int[] nums) {
        
        int sum = nums[0] ;
        int minsum = nums[0];
        
        for(int i=1 ; i< nums.length; i++)
        {
            sum += nums[i];
            minsum = Math.min(sum,minsum);
        }
        
        return minsum>0 ? 1 : 1 - minsum;
        
    }
}