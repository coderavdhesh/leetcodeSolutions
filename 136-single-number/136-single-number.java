class Solution {
    public int singleNumber(int[] nums) {
        
        int Xor = 0;
        
        for( int element : nums)
        {
            Xor ^= element;
        }
        
        return Xor;
    }
}