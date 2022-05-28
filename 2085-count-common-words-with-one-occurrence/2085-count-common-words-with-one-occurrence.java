class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        
        for(String str : words1)
        {
            map1.put(str, map1.get(str) == null ? 1 : map1.get(str)+1);
        }
        for(String str : words2)
        {
            map2.put(str, map2.get(str) == null ? 1 : map2.get(str)+1);
        }
        
        int count = 0;
        for (Map.Entry<String,Integer> entry : map1.entrySet())
        {         
            if(entry.getValue()==1)
            {
                 String key = entry.getKey();
                 if(map2.containsKey(key) && map2.get(key) ==1)
                 {
                     count++;
                 }
            }   
        } 
        return count;
        
        
    }
}