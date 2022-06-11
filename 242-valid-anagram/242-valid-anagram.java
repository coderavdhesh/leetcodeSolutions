class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i =0; i< s.length(); i++)
            map1.put(s.charAt(i), map1.get(s.charAt(i)) == null? 1 : map1.get(s.charAt(i))+1 );
        
        for(int i =0; i< t.length(); i++)
            map2.put(t.charAt(i), map2.get(t.charAt(i)) == null? 1 : map2.get(t.charAt(i))+1 );
        
        return map1.equals(map2) ;
    }
}