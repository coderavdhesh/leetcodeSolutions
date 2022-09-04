class Solution {
    public int thirdMax(int[] nums) {
        
        long min1 = Long.MIN_VALUE;
        long min2 = Long.MIN_VALUE;
        long min3 = Long.MIN_VALUE;
        
        for(int n : nums){
            if(min3 < n)
            {
                min1 = min2;
                min2 = min3;
                min3 = n;
            }
            else if(min3 > n && min2 <n)
            {
                min1 = min2;
                min2 = n;
            }
            else if(min2 > n && min1< n)
            {
                min1 = n;
            }
        }
        
        return min1 == Long.MIN_VALUE ? (int)min3 : (int)min1; 
    }
}