class Solution {
    public boolean areNumbersAscending(String s) {
        
        /*int prev = -1;
        
        for(int i=0; i<s.length() ;i++)
        {
            Boolean flag = Character.isDigit(s.charAt(i));
            if(flag)
            {
                int navi = Integer.parseInt(String.valueOf(s.charAt(i)));
                
                if(prev<navi)
                     prev = navi ;
                else                    
                    return false;
                
                prev = Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        return true; */   // IDK why it is not working
        
        
        int val = -1;
        
        for (String a : s.split(" ")) 
        {
            if (Character.isDigit(a.charAt(0))) 
            {
                int n = Integer.parseInt(a);
                if (val < n) 
                    val = n;
                else return false;
            }
        }
        return true;
        
    }
    
    
}