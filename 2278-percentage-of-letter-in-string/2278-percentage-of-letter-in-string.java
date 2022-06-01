class Solution {
    public int percentageLetter(String s, char letter) {
        
        int ouccur = 0;
        
        for(int i =0; i<s.length(); i++)
        {
            if(s.charAt(i) == letter)
                ouccur++;
        }
        
        return (ouccur*100) / s.length();
    }
}