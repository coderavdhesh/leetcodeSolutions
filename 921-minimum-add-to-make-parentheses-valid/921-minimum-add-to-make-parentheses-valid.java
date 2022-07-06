class Solution {
    public int minAddToMakeValid(String s) {
        
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
        
        return moves;
    }
}