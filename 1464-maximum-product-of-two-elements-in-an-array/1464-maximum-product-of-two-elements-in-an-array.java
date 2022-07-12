class Solution {
    public int maxProduct(int[] nums) {
        
        
        int max = 1;
        int secmax = 0;
        
        for(int num : nums)
        {
            if(max<num)
            {
                secmax = max;
                max = num;
            }
            else if(secmax<num)
            {
                secmax = num;
            }
        }
        
        return (max-1)*(secmax-1);
    }
}