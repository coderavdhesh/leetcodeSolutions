class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int one =0;
        
        for(int i : nums)
        {
            if(i == 1)
            { 
                one++;
                max = Math.max(max, one);
            }
            if( i == 0)
                one =0 ;
        }
        
        return max;
    }
}