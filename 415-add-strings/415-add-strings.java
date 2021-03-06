class Solution {
    public String addStrings(String num1, String num2) {
        
        int carry = 0;
        int n1 = num1.length()-1;
        int n2 = num2.length()-1;
        
        StringBuilder str = new StringBuilder();
        
        while( n1>=0 || n2>=0)
        {
            int sum = carry;
            
            if( n1 >= 0)
                sum+= (num1.charAt(n1--) - '0');
            if( n2 >= 0)
                sum+= (num2.charAt(n2--) - '0');
            
            str.append(sum%10);
            
            carry = sum/10;
        }
        
        if(carry != 0)
            str.append(carry);
        
        return str.reverse().toString();
    }
}