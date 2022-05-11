// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            pair product = obj.maxNtype(a, n);  
            System.out.println(product.second+" "+product.first);
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    
    static pair maxNtype(long arr[], long n)
    {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        
        for( long eachvalue : arr)
        {
            max = Math.max(max,eachvalue);
            min = Math.min(min,eachvalue);
        }
        
        if(max == arr[0] && min == arr[(int)n-1] )
            return new pair(2,max);
        else if(min == arr[0] && max == arr[(int)n-1] )
            return new pair(1,max);
        else if(arr[(int)n-1] > arr[0])
            return new pair(3,max);
        else
            return new pair(4,max);
        
        
    }
}

