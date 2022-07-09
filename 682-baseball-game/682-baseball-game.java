class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i =0; i< ops.length; i++)
        {
            String str = ops[i];
            
            if(checkNumber(str))
                stack.push(Integer.parseInt(str));
            else if( str.equals("C") )
                stack.pop();
            else if (str.equals("D") )
                stack.push(stack.peek()*2);
            else if( str.equals("+") )
            {
                int top = stack.pop();
                int result = stack.peek() + top;
                stack.push(top);
                stack.push(result);
            }
            
        }
        
        int sum =0;
        
        while( !stack.isEmpty() )
        {
            sum += stack.pop();
        }
        
        return sum;
        
    }
    
    public boolean checkNumber(String str )
    {
        try
        {
            int value = Integer.parseInt(str);
            
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}