class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet<String> set = new HashSet<>();
        
        for(String s : words)
        {
            String string = "";
            for(int i =0; i<s.length(); i++)
            {
                string += str[((int) s.charAt(i)- 97)] ;
            }
            set.add(string);
        }
        
        return set.size() ;
        
    }
}