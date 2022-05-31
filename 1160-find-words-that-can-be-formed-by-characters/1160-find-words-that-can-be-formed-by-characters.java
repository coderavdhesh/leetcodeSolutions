class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int length = 0;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i =0; i< chars.length(); i++)
            map.put(chars.charAt(i), map.get(chars.charAt(i)) == null ? 1 : map.get(chars.charAt(i))+1);
        
        HashMap<Character, Integer> temp_map = new HashMap<>();
        
        for(int i =0; i< words.length; i++)
        {
            temp_map.clear();
            
            Boolean bool = true;
            String str = words[i];
            
            for(int j =0; j< str.length(); j++ )
                temp_map.put(str.charAt(j), temp_map.get(str.charAt(j)) == null ? 1 : temp_map.get(str.charAt(j))+1 );
            
            for(char ch : temp_map.keySet())
            {
                if(!map.containsKey(ch))
                    bool = false;
                else if(map.get(ch) < temp_map.get(ch) ) 
                    bool = false;
            }
            if(bool)
                length += str.length();
        }
        
        return length;
    }
}