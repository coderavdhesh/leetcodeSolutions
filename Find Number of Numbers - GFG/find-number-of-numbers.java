// { Driver Code Starts
import java.util.*;
class Numbers{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		GfG g=new GfG();
		System.out.println(g.num(a,n,k));
	}
}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
          public static int num(int a[], int n, int k)
            {
                 //Your code here
                 int count =0;
                 for (int nums : a)
                 {
                     while(nums>0)
                     {
                         int rem = nums %10;
                         if(rem ==k)
                            count++;
                         nums /= 10;    
                     }
                 }
                 return count;
            }
}