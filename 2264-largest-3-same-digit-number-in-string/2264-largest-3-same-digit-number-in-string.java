class Solution {
    public String largestGoodInteger(String num) {
        
        int max = -1;
        
        for(int i =0; i<=num.length()-3; i++)
        {
            String str = num.substring(i, i+3) ;
            
            if(str.charAt(0) == str.charAt(1) && str.charAt(2) == str.charAt(1))
                   max = Math.max(max, Integer.parseInt(num.substring(i, i+3))) ;
            
        }
        
        if(max ==0 )
            return "000";
        else if(max == -1)
            return "";
        else
            return Integer.toString(max);
        
    }
}