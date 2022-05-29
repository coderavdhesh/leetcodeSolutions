class Solution {
    public int countPoints(String rings) {
        
        HashMap<Integer, HashSet<Character>> map = new HashMap<>();
        
        for(int i =0; i<rings.length(); i+=2)
        {
            char color = rings.charAt(i);
            int rod = (int) rings.charAt(i+1);
            
            if(map.containsKey(rod))
            {
                HashSet<Character> colorset = map.get(rod);
                
                colorset.add(color);
                map.put(rod, colorset);
            }
            else
            {
                HashSet<Character> colorset = new HashSet<>();
                
                colorset.add(color);
                map.put(rod, colorset);
            }
            
        }
        
        int count =0;
        
        for(int rods : map.keySet())
        {
            if(map.get(rods).size() == 3)
                count++;
        }
        
        return count;
    }
}