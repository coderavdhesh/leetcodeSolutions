class Solution {
    public List<String> commonChars(String[] words) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i =0; i<words[0].length(); i++)
        {
            char c = words[0].charAt(i);
            map.put(c , map.getOrDefault(c,1) +1);
        }
        
        for(int i =1; i< words.length; i++)
        {
            String str = words[i];
            
            HashMap<Character , Integer> map1 = new HashMap<>();
            for(int k =0; k<str.length(); k++)
            {
                char ch = str.charAt(k);
                map1.put(ch, map1.getOrDefault(ch, 1)+1);   
            }
            
            HashMap<Character , Integer> map2 = new HashMap<>();
            for(char c : map1.keySet())
            {
                if(map.containsKey(c))
                    map2.put(c, Math.min(map.get(c), map1.get(c)));
            }
            
            map = map2; 
        }
        
        ArrayList<String> list = new ArrayList<>();
        
        for(char ch : map.keySet())
        {
            int n = map.get(ch);
            for(int i=1; i<n; i++)
                list.add(""+ch);
        }
        
        return list;
        
    }
}