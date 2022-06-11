class Solution {
    public boolean checkOnesSegment(String s) {
        
        
        // nahi aya mere ko samajh me 
        
        int i,j;
        
        for(i=0;i<s.length();i++)
            if(s.charAt(i)=='0')
                break;

        for(j=i+1;j<s.length();j++)
            if(s.charAt(j)=='1')
                return false;
    
        return true;
            
    }
}