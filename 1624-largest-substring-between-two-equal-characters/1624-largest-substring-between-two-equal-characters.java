class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int length = -1;
        
        for(int i=0;i < s.length();i++)
        {
            char ch = s.charAt(i);
            if(map.containsKey(ch))
            {
                int temp = map.get(ch);
                length = Math.max(length, i-temp-1);
            }
            else
                map.put(ch, i);
        }
        
        return length;
    }
}