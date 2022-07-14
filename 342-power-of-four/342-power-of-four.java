class Solution {
    public boolean isPowerOfFour(int n) {
        
        if( n == 1)
            return true;
        
        return (n%4 == 0 && n!=0) ? isPowerOfFour(n/4) : false;
        
    }
}