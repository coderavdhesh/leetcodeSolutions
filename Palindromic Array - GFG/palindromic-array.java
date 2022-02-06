// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
    {
        //add code here.
        
        for(int element : a)
        {
            int temp = element;
            int num =0;
            
            while(temp>0)
            {
                int rem = temp%10;
                num = num*10 + rem;
                temp /= 10;
            }
            if (num != element)
                return 0;
        }
        
        return 1;
        
    }
    
    /*public static boolean checkPalindrome(int a)
    {
        int temp = a;
        int num =0;
        
        while(temp>0)
        {
            int rem = temp%10;
            num = num*10 + rem;
            temp /= 10;
        }
        
        if(nums == 1)
        return true;
        else
        return false;
        
    }*/
    
    
}