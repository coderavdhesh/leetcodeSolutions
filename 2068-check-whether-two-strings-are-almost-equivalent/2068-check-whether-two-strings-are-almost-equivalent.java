class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i =0; i<word1.length(); i++)
        {
            map1.put(word1.charAt(i) , map1.get(word1.charAt(i)) ==null ? 1: map1.get(word1.charAt(i)) +1);
        }
        
        for(int i =0; i<word2.length(); i++)
        {
            map2.put(word2.charAt(i) , map2.get(word2.charAt(i)) ==null ? 1: map2.get(word2.charAt(i)) +1);
        }
        
        int diff =0;
        for( char ch : map1.keySet())
        {
            if(map2.get(ch) == null)
                diff = map1.get(ch);
            else
                diff = Math.abs(map1.get(ch) - map2.get(ch));
            
            if(diff > 3)
                return false;
        }
        
        for( char ch : map2.keySet())
        {
            if(map1.get(ch) == null)
                diff = map2.get(ch);
            else
                diff = Math.abs(map1.get(ch) - map2.get(ch));
            
            if(diff > 3)
                return false;
        }
        
        return true;
        
        
    }
}