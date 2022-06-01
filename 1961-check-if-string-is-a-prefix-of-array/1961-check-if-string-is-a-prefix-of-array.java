class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
        String str = "";
        for(String word: words)
        {
            str += word;
            if(str.equals(s))
                return true;
            else if(str.length() > s.length())
                return false;
        }
        
        return false;
    }
}