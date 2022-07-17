class Solution {
    public int minSteps(String s, String t) {
        
        int count =0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i =0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.get(ch) == null ? 1 : map.get(ch)+1);
        }
        
        for(int j=0; j< t.length(); j++)
        {
            char c = t.charAt(j);
            
            if( map.containsKey(c) && map.get(c) != 0 )
                map.put(c , map.get(c)-1);
            else if( !map.containsKey(c) )
                count++;
            else if ( map.containsKey(c) && map.get(c) == 0)
                count++;
        }
        
        return count;
    }
}