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
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


//PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        // this code is having O(N) complexity for time.
        
        if( a.length < 2)
          return new long[]{-1};
        
        // creating max heap 
        PriorityQueue<Long> maxHeap = new PriorityQueue<Long>(Collections.reverseOrder());
        
        for(long element : a)
        {
            if(!maxHeap.contains(element))// do not include the duplicates
                 maxHeap.offer(element);
            // else
e
e
            //     continue;
            
            if(maxHeap.size() > 2)
                 maxHeap.poll();
        }
        
        if(maxHeap.size() < 2)
           return new long[]{-1};
         
        // creating array to get the output array.  
        long[] arr = new long[2];
        
        for(int i =1; i>=0; i--)
        {
            arr[i] = maxHeap.poll();
        }
        
        return arr;// array output 
        
    }
}
