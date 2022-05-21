// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

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
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            obj.Rearrange(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Compute {
    
    public void Rearrange(long a[], long n)
    {
        long[] arr = new long[(int) n];
        int k =0;
        
        for(long element : a)
        {
            if(element < 0)
               arr[k++] = element;
        }
        
        for(long element : a)
        {
            if(element >=0 )
                arr[k++] = element;
        }
        
        for(int i =0 ; i < (int)n ; i++)
        {
            a[i] = arr[i];
        }
    }
}