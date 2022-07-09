class Solution {
    public int scoreOfParentheses(String s) {
        
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i =0; i< s.length(); i++)
        {
            if(s.charAt(i) == '(')
                stack.push(-1);
            else
            {
                if(stack.peek() == -1)
                {
                    stack.pop();
                    stack.push(1);
                }
                else
                {
                    int score = 0;
                    while( stack.peek() != -1)
                        score += stack.pop();
                    stack.pop(); // pop out -1 of (
                    stack.push(2*score);
                }
            }
            
        }
        
        int sum =0;
        
        while( !stack.isEmpty() )
        {
            sum += stack.pop();
        }
        
        return sum;
    }
}