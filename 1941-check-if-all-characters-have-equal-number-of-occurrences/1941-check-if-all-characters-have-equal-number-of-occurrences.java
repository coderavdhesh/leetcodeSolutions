class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        HashMap<Character, Integer> Occur = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i); 
            Occur.put(s.charAt(i), Occur.get(ch) == null ? 1 :  Occur.get(ch)+1 );
        }
        
        int freq = Occur.get(s.charAt(0));
        
        for(int i=1; i<s.length(); i++)
        {
            if(Occur.get(s.charAt(i)) != freq)
                return false;
        }
        
        return true;
        
    }
}