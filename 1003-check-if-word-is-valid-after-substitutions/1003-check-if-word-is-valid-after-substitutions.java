class Solution {
    public boolean isValid(String s) {
        
        if(s.length() <= 2)
            return false;
        
        Stack<Character> stack = new Stack<>();
        
        stack.push(s.charAt(0));
        stack.push(s.charAt(1));
        
        for(int i =2; i< s.length(); i++)
        {
            int flag = 0;
            char ch = s.charAt(i);
            if( ch == 'c')
            {
                if( !stack.isEmpty() && stack.size()>= 2 )
                {
                    char top = stack.pop();
                    char top_2nd = stack.peek();
                    if(top == 'b' && top_2nd == 'a')
                    {
                        flag =1;
                        stack.pop();   
                    }
                    else
                    {
                        stack.push(top);
                    }
                }   
            }  
            if(flag == 0)
                stack.push(ch);
        }
        
        return stack.isEmpty();
        
    }
}