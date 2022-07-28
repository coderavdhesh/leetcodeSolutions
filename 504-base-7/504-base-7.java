class Solution {
    public String convertToBase7(int num) {
        
        if(num == 0)
            return 0+"";
        
        char sign = '+';
        if(num<0)
        {
            sign = '-';
            num *= -1;
        }
        
        StringBuilder str = new StringBuilder();
        
        while(num > 0)
        {
            str.append(num%7);
            num /= 7;
        }
        
        if(sign == '-')
            str.append('-');
        
        return str.reverse().toString();
    }
}