// { Driver Code Starts
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
            
            
            int l=sc.nextInt();
			int r=sc.nextInt();
			Solution ob = new Solution();
			ArrayList<Integer> numbers = ob.uniqueNumbers(l,r);
			for(int num : numbers){
			    System.out.print(num+" ");
			}
			System.out.println();

        }
    }
}
// } Driver Code Ends


class Solution{

    static ArrayList<Integer> uniqueNumbers(int L,int R){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>(); 
        
        while(L<=R)
        {
            int rounds =0;
            int num = L;
            while(num >0)
            {
                set.add(num%10);
                num /=10;
                rounds++;
            }
            if(set.size() ==  rounds)
                list.add(L);
                
            set.clear();   
            L++;
        }
        
        return list;
    }
}