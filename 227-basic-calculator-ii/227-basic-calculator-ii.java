class Solution {
    public int calculate(String s) {
        
        int len = s.length();
        char operator = '+';
        int digit = 0;
        
        Stack<Integer> values = new Stack<>();
        
        for(int i =0; i< s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if( Character.isDigit(ch) )
                digit = digit*10 + ch - '0';
            
            
            if( (!Character.isDigit(ch) && ch != ' ') || i == len-1)
            {
                if(operator == '+')
                    values.push(digit);
                else if (operator == '-')
                    values.push(-digit);
                else if (operator == '*')
                    values.push(values.pop() * digit);
                else if (operator == '/')
                    values.push(values.pop() / digit);
                
                operator = ch ;
                digit = 0;
            }
        }
                
        int ans = 0;
        
        while(!values.isEmpty() )
        {
            ans += values.pop();
        }
        
        return ans;
    }
}