class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        String[] words = sentence.split("\\s");
        
        int idx = searchWord.length();
        for(int i =0; i<words.length; i++)
        {
            if(idx > words[i].length())
                continue;
            if(words[i].substring(0,idx).equals(searchWord) )
                return i+1;
        }
        
        return -1;
        
        
    }
}