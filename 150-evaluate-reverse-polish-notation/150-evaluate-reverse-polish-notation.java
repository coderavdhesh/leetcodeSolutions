class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i =0 ; i< tokens.length; i++)
        {
            if(checkDigit(tokens[i]))
                stack.push(Integer.parseInt(tokens[i]));
            else
            {
                int a = stack.pop();
                int b = stack.pop();
                char c = tokens[i].charAt(0);
                
                stack.push(result(a,b,c));
                System.out.println(stack.peek());
            }
                
        }
        return stack.pop();
        
    }
    
    public boolean checkDigit(String str)
    {
        int a;
        try{
            a = Integer.parseInt(str);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }    
    
    public int result(int b, int a, char c)
    {
        switch(c){
            case '+' : return a+b;
            case '-' : return a-b;
            case '*' : return a*b;
            case '/' : return a/b;
        }
        return 0;
    }
}