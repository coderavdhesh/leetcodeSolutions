class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.get(ch) == null ? 1 : map.get(ch)+1);
        }
        
        for(int j =0; j< t.length(); j++){
            char ch = t.charAt(j);
            if(!map.containsKey(ch))
                return false;
            else
            {
                if(map.get(ch)== 0)
                    return false;
                map.put(ch, map.get(ch)-1);
            }
        }
        
        for(char c : map.keySet())
        {
            if(map.get(c) !=0)
                return false;
        }
        
        return true;
    }
}