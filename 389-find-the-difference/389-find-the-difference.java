class Solution {
    public char findTheDifference(String s, String t) {
        
        // this code is having o(n) time but consuming more space
        /*HashMap<Character,Integer> mapS = new HashMap<>();
        HashMap<Character,Integer> mapT = new HashMap<>();
        
        for(int i =0; i<s.length(); i++)
            mapS.put(s.charAt(i), mapS.get(s.charAt(i)) == null ? 1 : mapS.get(s.charAt(i))+1 );
        
        for(int i =0; i<t.length(); i++)
            mapT.put(t.charAt(i), mapT.get(t.charAt(i)) == null ? 1 : mapT.get(t.charAt(i))+1 );
        
        if(mapS.size() == 0)
            return t.charAt(0);
        
        for(char ch : mapT.keySet())
        {
            if( mapS.get(ch) != mapT.get(ch) )
                return ch;
        }

        return ' ';*/
        
        // Let's try the bit manipulation
        
        char xor = ' ';
        
        for(int i =0; i<s.length() ; i++)
            xor ^= s.charAt(i);
        
        for(int i =0; i<t.length() ; i++)
            xor ^= t.charAt(i);
        
        return Character.toLowerCase(xor);
        
    }
}