class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        
        for(int i =0; i< s.length(); i++)
        {
            stack1.push(s.charAt(i));
            
            if(s.charAt(i) == '#')
            {
                stack1.pop();
                if(!stack1.isEmpty())
                    stack1.pop();
            }
        }
        
        for(int i =0; i< t.length(); i++)
        {
            stack2.push(t.charAt(i));
            
            if(t.charAt(i) == '#')
            {
                stack2.pop();
                if(!stack2.isEmpty())
                    stack2.pop();
            }
        }
        
        return stack1.equals(stack2);
    }
}