// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int i =0, j=0 ;
        int sum =0 ;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(j<n)
        {
            sum += arr[j];
            
            if(sum<s)
            {
                j++;
            }
            else if (sum>s)
            {
                sum =0;
                i++;
                j = i;
            }
            else
            {
                list.add(i+1);
                list.add(j+1);
                break;
            }
        }
        
        if(list.size() == 0) 
        {
            list.add(-1);
        }
        
        return list;
    }
}