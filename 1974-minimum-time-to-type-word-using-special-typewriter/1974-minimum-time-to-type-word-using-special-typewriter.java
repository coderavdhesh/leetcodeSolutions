class Solution {
    public int minTimeToType(String word) {
        
        int initial = 97;
        int time =0;
        int type =0;
        
        for(int i =0; i<word.length(); i++)
        {
            
            int clockwise = Math.abs( (int)word.charAt(i) - initial );
            int anticlockwise = 0;
            if(initial > (int)word.charAt(i))
                anticlockwise = Math.abs( (initial)  - ((int)word.charAt(i)+26) );
            else
                anticlockwise = Math.abs( (initial+26)  - ((int)word.charAt(i)) ) ;
            
            time +=  Math.min(clockwise, anticlockwise);// time to rotate
            
            initial = (int) word.charAt(i);
        }
        
        return time + word.length();
    }
}