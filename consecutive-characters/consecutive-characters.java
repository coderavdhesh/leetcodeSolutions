class Solution {
    public int maxPower(String s) {
        
        int max = 0;
        int count =0;
        for(int i=0 ; i<s.length()-1; i++)
        {
            if(s.charAt(i+1) == s.charAt(i))
            {
                count++;
                max = Math.max(max,count);
            }
            else
                count=0;
        }
        return max>0 ? max+1 : 1;
    }
}