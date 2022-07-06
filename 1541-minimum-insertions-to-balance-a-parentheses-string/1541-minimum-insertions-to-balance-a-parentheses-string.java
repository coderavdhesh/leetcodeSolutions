class Solution {
    public int minInsertions(String s) {
        
        Stack<Character> stack=  new Stack<>();
        int count =0;
        
        for(int i = 0 ; i< s.length() ;)
        {
            char ch = s.charAt(i);
            
            if(ch == '(')
            {
                stack.push(ch);
                i++;
            }
            else
            {
                if(stack.isEmpty() )
                {
                    if( i+1 < s.length() && s.charAt(i+1) == ')')
                    {
                        count++;
                        i+=2;
                    }
                    else
                    {
                        count+=2;
                        i++;
                    } 
                }
                else
                {
                    if( i+1 < s.length() && s.charAt(i+1) == ')')
                    {
                        i+=2;
                    }
                    else
                    {
                        count++;
                        i++;
                    }
                    
                    stack.pop();// '(' will pop out
                }
            }
            
        }
        
        while(!stack.isEmpty() )
        {
            count+=2;
            stack.pop();
        }
        
        return count;
    }
}