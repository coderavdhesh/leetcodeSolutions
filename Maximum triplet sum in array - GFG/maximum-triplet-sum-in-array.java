// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    
  
    int maxTripletSum(int arr[], int n)
    {
        // Complete the function
        int m1=Math.max(arr[0],arr[1]);
    	int m2=Math.min(arr[0],arr[1]);
    	int m3=Integer.MIN_VALUE;
    	for(int i=2;i<n;i++){
    	    if(arr[i]>m1) {
    	        m3=m2;
    	        m2=m1;
    	        m1=arr[i];
    	    }
    	    else if(arr[i]>m2){
    	        m3=m2;
    	        m2=arr[i];
    	    }
    	    else if(arr[i]>m3) 
    	        m3=arr[i];
    	}
    	return m1+m2+m3;
    }
  
    
}


// { Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.maxTripletSum(arr, sizeOfArray);
		    System.out.println(res);
		}
	}
}

  // } Driver Code Ends