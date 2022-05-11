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

            int ans = new Solution().getSingle(arr, n);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java



class Solution {
    int getSingle(int arr[], int n) {
        // code here
        
        // we can use BitManupilation XOR
        
        // int Xor = 0;
        
        // for( int element :  arr)
        // {
        //     Xor ^= element;
        // }
        
        // return Xor;
        
        
        // we can also use hashMap to map the values of every key and get the odd Key
        
        HashMap<Integer, Integer> maps = new HashMap<>();
        
        for( int i : arr)
        {
            maps.put(i, maps.get(i)==null ? 1 : maps.get(i)+1 );
        }
        
        for( int j : arr)
        {
            if(maps.get(j)%2 != 0)
                return j;
        }
        
        return 0;
        
    }
}