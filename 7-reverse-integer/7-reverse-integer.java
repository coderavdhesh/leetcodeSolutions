class Solution {
   static int reverse(int x) {
       long rev =0;
       int ans = x;
       if(x<0)
           x*=(-1);
       while(x>0)
       {
           rev = rev*10 + x%10;
           x /=10;
       }
        
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE )
          return 0;
        else
          return (ans<0)? (int)rev*(-1) : (int)rev;
           
   }
}