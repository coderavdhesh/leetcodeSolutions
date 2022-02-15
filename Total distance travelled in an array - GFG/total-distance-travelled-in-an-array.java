// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            long ans = new Solution().distance(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int abs(int a, int b){
        return (a-b)<0 ? (a-b)*(-1) : (a-b) ;
    }
    long distance(int[] arr, int n) {
        // code here
        int[] ary = new int[n];
        
        for(int i=0; i<n; i++)
        {
            ary[arr[i]-1] = i;
        }
        int sum =0 ;
        
        for(int i=0; i<n-1; i++)
        {
            sum += abs(ary[i],ary[i+1]);
        }
        return sum;
    }
}
