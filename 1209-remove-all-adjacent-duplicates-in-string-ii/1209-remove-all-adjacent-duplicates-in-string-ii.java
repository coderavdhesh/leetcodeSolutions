class Solution {
    
    public class Pair
    {
        char c;
        int n;
        Pair(char c,int n)
        {
            this.c = c;
            this.n = n;
        }
    }
    public String removeDuplicates(String s, int k) {
        
        Stack<Pair> stack = new Stack<>();
        
        for(int i =0; i< s.length() ; i++)
        {
            char ch = s.charAt(i);
            
            if(!stack.isEmpty() && stack.peek().c == ch)
                stack.peek().n++;
            else
                stack.push(new Pair(ch, 1));
            
            if( stack.peek().n == k)
                stack.pop();
        }
        
        StringBuilder str = new StringBuilder();
        
        while(!stack.isEmpty())
        {
            int num = stack.peek().n;
            char chars = stack.pop().c;
            while(num>0)
            {
                str.append(chars);
                num--;
            }
        }
        
        return str.reverse().toString();
    }
}