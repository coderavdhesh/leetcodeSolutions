class Solution {
    public String reverseOnlyLetters(String s) {
        
        // strings are immutable ... so we have to use the StrBuilder
        int l = 0 , r = s.length()-1;
        
        StringBuilder sb = new StringBuilder(s);
        
        while(l <= r)
        {
            if(!Character.isLetter(s.charAt(l))) 
                l++;
            else if(!Character.isLetter(s.charAt(r))) 
                r--;
            else 
            {
                // same as swapping ,,, but using the strbuilder
                sb.setCharAt(l, s.charAt(r));
                sb.setCharAt(r, s.charAt(l));
                l++;
                r--;
            }
        }
        return sb.toString();// converting into string
    }
}