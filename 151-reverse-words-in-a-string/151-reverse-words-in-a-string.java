class Solution {
    public String reverseWords(String s) {
        
        s.trim();
        
        String[] str = s.split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = str.length-1; i>=0; i--)
        {
            sb.append(str[i]);
            sb.append(new StringBuilder(" "));
        }
        
        return sb.toString().trim();
    }
}