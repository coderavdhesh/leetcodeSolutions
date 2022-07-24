class Solution {
    public boolean judgeSquareSum(int c) {
        
        long start = 0;
        long end = (int) (sqrt(c)) ;
        
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
    
    public int sqrt(long n)
    {
        long start =0;
        long end = n;
        
        while(start<=end)
        {
            long mid = start +( end - start )/2;
            if(mid*mid <= n)
                start = mid +1;
            else
                end = mid -1;        
        }
        return (int)start-1;
    }
}