class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> ranMap = new HashMap<>();
        HashMap<Character, Integer> magMap = new HashMap<>();
        
        for(int i =0; i< ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            ranMap.put(ch, ranMap.get(ch)== null? 1 : ranMap.get(ch)+1 );
        }
        
        for(int i =0; i< magazine.length(); i++){
            char ch = magazine.charAt(i);
            magMap.put(ch, magMap.get(ch)== null? 1 : magMap.get(ch)+1 );
        }
        
        for(char key : ranMap.keySet())
        {
            if(!magMap.containsKey(key) || (magMap.get(key) < ranMap.get(key)))
                return false;
        }
        
        return true;
    }
}