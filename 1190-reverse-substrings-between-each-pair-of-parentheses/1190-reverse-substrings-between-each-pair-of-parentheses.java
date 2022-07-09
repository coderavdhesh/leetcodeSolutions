class Solution {
    public String reverseParentheses(String s) {
        
        StringBuilder str = new StringBuilder("");
        Stack<StringBuilder> stack = new Stack<>();
        
        for(int i =0; i< s.length(); i++)
        {
            char ch = s.charAt(i);
            if( ch != '(' && ch != ')')
                str.append(ch);    
            else if(ch == '(')
            {
                stack.push(str);
                str = new StringBuilder("");
            }
            else if(ch == ')')
            {
                
                if(!stack.isEmpty())
                {
                    str = stack.pop().append(str.reverse()) ; 
                }
                else if (!str.isEmpty() && stack.isEmpty())
                    return str.reverse().toString();
            }
            
            System.out.println(str.toString());
        }
        
        return str.toString();
        
    }
}