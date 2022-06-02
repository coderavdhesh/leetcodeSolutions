class Solution {
    public String replaceDigits(String s) {
        
        String checkStr = "0987654321";
        String str = "" + s.charAt(0);
        for(int i =1 ; i<s.length(); i++)
        {
            if(checkStr.indexOf(s.charAt(i)) != -1)
                str += (char)(s.charAt(i-1) + Character.getNumericValue(s.charAt(i)) );
            else
                str += s.charAt(i);
        }
        
        return str;
        
    }
}