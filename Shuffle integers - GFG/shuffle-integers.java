// { Driver Code Starts
//Initial Template for Java



//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java





class  Solution
{
    void shuffleArray(long arr[], int n)
    {
        // Your code goes here
        
        long[] a = new long[n];
        
        int i=0;
        int j = n/2;
        
        int k=0;
        while(k<n)
        {
            if((k+1) %2 == 1)//even index
            {
                a[k] = arr[i];
                i++;
            }
            if((k+1) % 2 == 0)//odd index
            {
                a[k] = arr[j];
                j++;
            }
            k++;
        }
        
        for(int g=0; g<n; g++)
        {
            arr[g] = a[g];
        }
        
    }
}


// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] q = line.trim().split("\\s+");
//            int n =Integer.parseInt(q[0]);
//            int k =Integer.parseInt(q[1]);
            //int y =Integer.parseInt(a2[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
             Solution ob = new  Solution();
            //ArrayList<Long> ans=
            ob.shuffleArray(a,n);
           // System.out.println(ob.shuffleArray(a,n));
            for (int i = 0; i < n; i++)
                System.out.print(a[i]+" ");
            System.out.println();
        }
    }
}

  // } Driver Code Ends