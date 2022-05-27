class Solution {
    public String truncateSentence(String s, int k) {
        
        int count =0;
        int i=0;
        
        while(count<k)
        {
            if(i == s.length())
                return s;
            if(s.charAt(i) == ' ')
                count++;
    
            i++;
        }
        
        return s.substring(0,i-1);
    }
}