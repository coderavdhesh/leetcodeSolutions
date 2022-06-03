class Solution {
    public int lengthOfLastWord(String s) {
        
        s.trim();
        
        String[] str = s.split("\\s+");
        
        return str[str.length-1].length(); 
        
    }
}