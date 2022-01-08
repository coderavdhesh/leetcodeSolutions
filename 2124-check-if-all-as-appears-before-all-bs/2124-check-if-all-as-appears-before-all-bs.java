class Solution {
    public boolean checkString(String s) {
    
        int n = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == 'a' )
            {if(n==-1)
                    return false;}
            else
                n=-1;
        }
        
        // int ia=0;
        // for(int i=0; i<s.length(); i++) {
        //     if(s.charAt(i) == 'a')
        //     {
        //         if(ia == -1) 
        //             return false;
        //     }
        //     else
        //     {
        //          ia = -1;
        //     }
        // } 
        
        return true ;
            
    }
}