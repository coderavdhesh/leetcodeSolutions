class Solution {
    public String toLowerCase(String s) {
        
        //return s.toLowerCase();
        
        char[] ch = s.toCharArray();
        
        for(int i =0; i<ch.length; i++ )
        {
            if(ch[i]>64 && ch[i]<91)
                ch[i] += 32;
        }
        
        return String.valueOf(ch);
        
    }
}