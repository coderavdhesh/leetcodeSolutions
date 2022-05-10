// { Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.print2largest(a,n));
        }
        
	}
}// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    public static int print2largest(int A[],int N) 
    {
        //CODE HERE
        
        //O(n)
        
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for(int i =0 ; i< N; i++)
        {
            firstMax = Math.max(firstMax, A[i]);
        }
        
        for(int i =0 ; i< N; i++)
        {
            if(firstMax != Integer.MIN_VALUE && firstMax != A[i])
                secondMax = Math.max(secondMax, A[i]); 
        }
        
        return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
        
    }
}
        
