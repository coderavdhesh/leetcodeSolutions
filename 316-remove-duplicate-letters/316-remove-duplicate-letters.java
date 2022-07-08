class Solution {
    public String removeDuplicateLetters(String s) {
        
//        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(!stack.contains(ch) && !stack.isEmpty())
            {
                while( !stack.isEmpty() && (int)stack.peek() > (int)ch && s.substring(i,s.length()).indexOf(stack.peek()) != -1 )
                {
                    stack.pop();
                    // stack.push(ch);
                }
                    stack.push(ch);
            
                    
            }
            else if (stack.isEmpty())
            {
                stack.push(ch);
            }
        }
        
        System.out.print(stack);
        
        String ans="";
        
        while(stack.size()>0)
        {
            ans=stack.pop()+ans;
        }
        return ans;
    
    }
}