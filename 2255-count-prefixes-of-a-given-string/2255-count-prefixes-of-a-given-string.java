class Solution {
    public int countPrefixes(String[] words, String s) {
        
        HashSet<String> StringSet = new HashSet<>();
        
        for(int i=1 ; i<=s.length(); i++)
        {
            StringSet.add(s.substring(0,i));
        }
        
        int count =0;
        
        for(int i =0; i<words.length; i++)
        {
            if(StringSet.contains(words[i]))
                count++;
        }
        
        return count;
        
    }
}