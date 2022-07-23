class Solution {
    public int arrangeCoins(int n) {
        
        int i =0;
        
        while(n > i)
        {
            i++;
            n = n - i;
        }
        
        return i;
    }
}