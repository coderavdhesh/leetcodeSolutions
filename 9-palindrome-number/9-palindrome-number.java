class Solution {
    public boolean isPalindrome(int x) {
        
        int temp = x;
        
        int num = 0;
        
        while(temp > 0)
        {
            int rem = temp %10;
            num = num*10 + rem;
            temp /= 10;
        }
        
        return (num - x) == 0 ;
        
    }
}