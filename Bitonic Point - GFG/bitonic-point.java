// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int findMaximum(int[] arr, int n) {
        // code here
        int s=0,e=n-1;
    
    if((arr[s]<arr[s+1]) && (arr[e-1]<arr[e]))
    return arr[e];
    
    while(s<=e)
    {
        int mid=s+(e-s)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
        return arr[mid];
        else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1])
        {
        e=mid-1;
        }
        else
        s=mid+1;

}