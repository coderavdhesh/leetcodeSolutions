class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int Xor = 0;
        for(int i = 0; i< nums.length; i++)
        {
            Xor ^= nums[i];
        }
        return Xor;
    }
}