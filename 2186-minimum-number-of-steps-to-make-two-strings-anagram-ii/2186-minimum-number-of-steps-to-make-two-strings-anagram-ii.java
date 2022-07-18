class Solution {
    public int minSteps(String s, String t) {
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i =0; i< s.length(); i++)
        {
            char ch = s.charAt(i);
            map1.put(ch, map1.get(ch) == null ? 1 : map1.get(ch)+1 );
        }
        
        for(int i =0; i< t.length(); i++)
        {
            char ch = t.charAt(i);
            map2.put(ch, map2.get(ch) == null ? 1 : map2.get(ch)+1 );
        }
        
        int steps = 0;
        
        for(char c : map2.keySet())
        {
            if( !map1.containsKey(c) )
                steps += map2.get(c);
            else
                steps = steps + Math.abs(map1.get(c) - map2.get(c));
        }
        
        for(char c : map1.keySet())
        {
            if( !map2.containsKey(c) )
                steps += map1.get(c);
        }
        
        return steps;
    }
}