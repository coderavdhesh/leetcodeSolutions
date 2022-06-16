class Solution {
    public int secondHighest(String s) {
        
        String nums = "1234567890";
        
        int firstMax = -1;
        int secondMax = -1;
        
        for(int i =0; i< s.length(); i++)
        {
            if( nums.indexOf(s.charAt(i)) != -1 )
            {
                int n = Character.getNumericValue(s.charAt(i));
                if( n > firstMax)
                {
                    secondMax = firstMax;
                    firstMax = n;
                }
                else if( n > secondMax && n < firstMax )
                {
                    secondMax = n;
                }
            }
        }
        
        return secondMax;
        
    }
}