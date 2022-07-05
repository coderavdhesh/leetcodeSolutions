class Solution {
    public int minimumDeletions(String s) {
        
        Stack<Character> stack = new Stack<>();
        int count =0 ;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if(!stack.isEmpty() && stack.peek() == 'b' && ch == 'a')
            {
                stack.pop();
                count++;
            }
            else if (ch == 'b')
                stack.push(ch);
        }
        
        
        return count;
        
    }
}