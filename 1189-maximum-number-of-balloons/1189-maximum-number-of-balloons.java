class Solution {
    public int maxNumberOfBalloons(String text) {
        
        String str = "balon";//balloon - 11221
    
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i =0; i< text.length(); i++)
        {
            if(str.indexOf(text.charAt(i)) != -1)
                map.put(text.charAt(i), map.get(text.charAt(i))==null ? 1 : map.get(text.charAt(i))+1 );
        }
        
        if(map.size() < 5)
            return 0;
        
        int min_ban = Integer.MAX_VALUE;
        int min_ol = Integer.MAX_VALUE;
        
        for( char ch : map.keySet() )
        {
            if( ch == 'b' || ch == 'a' || ch == 'n' )
                min_ban = Math.min(min_ban, map.get(ch));
            else
                min_ol = Math.min( min_ol, map.get(ch) ) ; 
        }
        
        return Math.min(min_ban, min_ol/2);
    }
}