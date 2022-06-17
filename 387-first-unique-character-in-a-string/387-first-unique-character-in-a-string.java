class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i =0; i< s.length() ; i++)
            map.put(s.charAt(i), map.get(s.charAt(i)) == null ? 1 : map.get(s.charAt(i)) +1);
        
        for(int i =0; i< s.length(); i++)
            if(map.get(s.charAt(i)) == 1)
                return i;
        
        return -1;
    }
}