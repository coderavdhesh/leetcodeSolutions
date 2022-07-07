class Solution {
    public int maxScore(String s) {
        
        int max = 0;
        int once = 0;
        
        for(int i =0; i< s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == '1')
                once++;
        }
        
        int zeros =0;
        
        for(int i =0; i< s.length()-1; i++)
        {
            char ch = s.charAt(i);
            
            if(ch == '0')
                zeros++;
            else if(ch == '1')
                once--;
            
            max = Math.max(max, zeros+once);
        }
        
        return max;
    }
}