class Solution {
    public int missingNumber(int[] nums) {
        
        int res =0;
         int i=0;  
         while(i<nums.length)
         {
             res ^= nums[i]^i++;
         }
         return res^i;
    }
}