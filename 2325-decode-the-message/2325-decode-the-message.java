class Solution {
    public String decodeMessage(String key, String message) {
        
        HashMap<Character, Character> map = new HashMap<>();
        
        char ch = 'a';
        
        for(int i =0; i< key.length(); i++)
        {
            if( !map.containsKey(key.charAt(i)) && key.charAt(i) != ' ' )
                map.put(key.charAt(i), ch++);
        }
        
        StringBuilder str = new StringBuilder();
        
        for(int j =0; j<message.length(); j++)
        {
            char c = message.charAt(j);
            if( !map.containsKey(c))
                str.append(" ");
            else
                str.append(map.get(c));
        }
        
        return str.toString();
    }
}