class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        stack.push(s.charAt(0));
        
        for(int i =1; i< s.length(); i++)
        {
            if(!stack.isEmpty() && stack.peek() == s.charAt(i))
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!stack.isEmpty())
        {
            char ch = stack.pop();
            sb.append(ch);
        }
        
        return sb.reverse().toString();
        
    }
}