class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int idx = pref.length();
        int count =0;
        
        for(int i =0; i<words.length; i++)
        {
            if(idx > words[i].length())
                continue;
            if(words[i].substring(0,idx).equals(pref) )
                count++;
        }
        
        return count;
    }
}