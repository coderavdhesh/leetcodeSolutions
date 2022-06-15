class Solution {
    public int countEven(int num) {
        
        int count =0;
        
        for(int i = 1; i<= num ; i++)
        {
            if(digitSumCheck(i))
                count++;
        }
        
        return count;
    }
    public boolean digitSumCheck(int n)
    {
        int sum =0;
        while(n>0)
        {
            int rem = n%10;
            sum += rem;
            n /= 10;
        }
        
        return (sum %2 == 0) ;
    }
}