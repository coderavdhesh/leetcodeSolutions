class Solution {
    public boolean checkString(String s) {
    
//         int a = -1;
        
//         for(int i=0; i<s.length()-1; i++)
//         {
//           if(s.charAt(i) != s.charAt(i+1) && a>0 || s.charAt(i) == 'a' )
//                 return false;
//             else if(s.charAt(i) != s.charAt(i+1) && a<0)
//             {
//                 a++;
//                 continue;
//             }
//             else if(s.charAt(i) == s.charAt(i+1) && a<0){
//                 continue;
//             }
            
//         }
        
        int ia=0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'a')
            {
                if(ia == -1) 
                    return false;
            }
            else
            {
                 ia = -1;
            }
        }    
        return true ;
            
    }
}