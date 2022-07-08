class Solution {
    public String smallestSubsequence(String s) {
        
        int len = s.length()-1;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i =0; i<= len; i++)
        {
            char ch = s.charAt(i);
            if( stack.isEmpty() )
                stack.push(ch);
            
            if(!stack.isEmpty() && !stack.contains(ch) )
            {
                while(!stack.isEmpty() && (int)stack.peek() > (int)ch && s.substring(i,len+1).indexOf(stack.peek()) != -1 )
                {
                        stack.pop();
                }
                
                stack.push(ch);
            }
        }
        
        StringBuilder str = new StringBuilder() ;
        
        while( !stack.isEmpty() )
        {
            str.append(stack.pop());
        }
        
        return str.reverse().toString();
        
        
    }
}