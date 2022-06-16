class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        if(s1.length() != s2.length())
            return false;
        if(s1.equals(s2))
            return true;
        
        int i =0, k= 0, j=0 ;
        boolean kbool = false;
        
        while(k<s1.length())
        {
            if(s1.charAt(k) == s2.charAt(k))
                k++;
            else if (s1.charAt(k) != s2.charAt(k) && !kbool)
            {
                i = k;
                k++;
                kbool = true;
            }
            else if( s1.charAt(k) != s2.charAt(k) && kbool )
            {
                j = k;
                break;
            }
            
            if(k > s1.length()-1 && (j ==0 || i ==0) )
                return false;
        }
        
        // swap of i and k;
        
        String s = swap(s2, i, k);
        
        return s.equals(s1);
        
        
    }
    
    public String swap(String str, int i, int j)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
    
    
}