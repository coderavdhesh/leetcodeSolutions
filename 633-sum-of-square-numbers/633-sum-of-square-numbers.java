class Solution {
    public boolean judgeSquareSum(int c) {
        
        long start = 0;
        long end = (int) (Math.sqrt(c)) ;
        
        while(start<=end)
        { 
            long mid = end*end+(start*start); 
            if(mid == c) 
                return true;
            if( mid >c ) 
                end--;
            else 
                start++;
        }
        
        return false;
    }
}