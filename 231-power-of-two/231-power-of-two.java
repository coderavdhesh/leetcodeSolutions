class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n == 1)
            return true;
        
        return (n%2 == 0 && n != 0) ? isPowerOfTwo(n/2) : false;
        
    }
}