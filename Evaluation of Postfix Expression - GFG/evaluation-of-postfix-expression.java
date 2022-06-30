// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        
        Stack<Integer> stack = new Stack<Integer>();
        
        for (char c : S.toCharArray()) {
           if (Character.isDigit(c)) 
           {
                stack.push((int) (c - '0'));                             
           } 
           else 
           {
                if (stack.size() <= 1) {
                    return -1;
                }
                
                int a = stack.pop();
                int b = stack.pop();
                
                int result = performOperation(b, a, c);
                stack.push(result);
           }
           
        }
        
        return stack.pop();
    }
    
	private static int performOperation(int a, int b, char c) 		  
	{
        switch(c) {
            case '+' : return a + b;
            case '-' : return a - b;
            case '*' : return a * b;
            case '/' : return (int) (a / b);
            default: return -1;
        }
        
        
    }
}