class Solution {
    public int minStartValue(int[] nums) {
        
        int sum = 0;
        int minsum = 0;
        
        for(int i : nums)
        {
            sum += i;
            minsum = Math.min(sum,minsum);
        }
        
        return minsum>0 ? 1 : 1 - minsum;
        
    }
}