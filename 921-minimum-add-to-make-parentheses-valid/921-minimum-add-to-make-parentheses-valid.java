class Solution {
    public int minAddToMakeValid(String s) {
        
        // Method One : stack wala
        /*
        Stack<Character> stack = new Stack<>();
        int moves =0;
        
        for(int i =0; i< s.length() ; i++)
        {
            char ch = s.charAt(i);
            
            if(ch == '(')
                stack.push(ch);
            else
            {
                if(!stack.isEmpty())
                    stack.pop();
                else
                    moves++;
            }
        }
        
        while(!stack.isEmpty())
        {
            moves++;
            stack.pop();
        }
        
        return moves;     */
        
        
        int open =0 ;
        int close = 0;
        int needs = 0;
        
        for(int i =0; i< s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(')
                open++;
            else
            {
                if(open>close)
                {
                    close++;
                    // open--;
                }
                else
                    needs++;
            }
        }
        
        int n = (open-close);
        
        if(n>0)
            needs+=n;
        
        return needs;
    }
}