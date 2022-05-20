// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            long b[] = new long[(int)(n)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n-1; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.findMissing(a, b, n));
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {

    public long findMissing(long a[], long b[], int n) {
        
        long Xor = 0;
        
        for(long ele : a)
        {
            Xor ^= ele;
        }
        for(long yly : b)
        {
            Xor ^= yly;
        }
        
        return Xor;
    }
}