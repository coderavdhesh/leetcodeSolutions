class Solution {
    public int maxPower(String s) {
        
        int power = 1;
        int max = 1;
        
        for(int i =1; i< s.length(); i++)
        {
            if( s.charAt(i) == s.charAt(i-1) )
            {
                power++;
                max = Math.max(max, power);
            }
            else
                power = 1;
        }
        return max;
    }
}