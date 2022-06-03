class Solution {
    public int lengthOfLastWord(String s) {
        
//         s.trim();
        
//         String[] str = s.split("\\s+");
        
//         return str[str.length-1].length();
        
        
        // we can also solve it like this 
        
        int lastOne = 0;
        s = s.trim();
        for(int i = s.length() -1; i >= 0; i--) {
            if(s.charAt(i) == ' ')
                break;
            lastOne++;
        }        
        return lastOne;
    }
}