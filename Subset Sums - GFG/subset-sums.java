//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        int len = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i =0; i< (1<<len); i++){
            ArrayList<Integer> sub =new ArrayList<>();
            
            for(int j = 0; j< len ; j++){
                if((i & (1<<j)) != 0 )
                {
                    sub.add(arr.get(j));
                }
            }
            list.add(sub);
        }
        
        for(List<Integer> ls : list){
            ans.add(sum(ls));
        }
        
        return ans;
    }
    
    public int sum(List<Integer> l){
        int total = 0;
        for(int n: l){
            total += n;
        }
        return total;
    }
}