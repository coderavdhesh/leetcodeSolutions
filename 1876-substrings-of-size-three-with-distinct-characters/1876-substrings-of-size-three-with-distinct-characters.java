class Solution {
    public int countGoodSubstrings(String s) {
        
        int count =0;
        HashSet<Character> set = new HashSet<>();
        
        for(int i =0; i<s.length()-2; i++)
        {
            set.clear();
            set.add(s.charAt(i));
            set.add(s.charAt(i+1));
            set.add(s.charAt(i+2));
            
            if(set.size() == 3)
                count++;
        }
        return count;
    }
}