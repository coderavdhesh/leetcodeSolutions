class Solution {
    public int countCollisions(String directions) {
        
        Stack<Character> stack = new Stack<>();
        
        int collides = 0;
        
        for(int i=0; i< directions.length() ; i++)
        {
            char ch = directions.charAt(i);
            if(stack.isEmpty() || ch == 'R')
                stack.push(ch);
            
            if( ch == 'S') //!stack.isEmpty() &&
            {
                while(!stack.isEmpty() && stack.peek() == 'R')
                {
                    stack.pop();
                    collides++;
                }
                stack.push('S');
            }
            
            else if(ch == 'L')
            {
                if(stack.peek() == 'L')
                    continue;
                
                if(!stack.isEmpty() && stack.peek()== 'S')
                {
                    collides++;
                    continue;
                }
                
                if(!stack.isEmpty() && stack.peek()== 'R')
                {
                    stack.pop();
                    collides+=2;
                }
                
                while(!stack.isEmpty() && stack.peek()== 'R')
                {
                    stack.pop();
                    collides++;
                }
                stack.push('S');
            }
        }
        
        return collides;
    }
}