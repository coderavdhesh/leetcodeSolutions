class Solution {
    public int minimumMoves(String s) {
        
        int index = 0;
        int result = 0;
        
        while (index < s.length()) 
        {
            if (s.charAt(index) == 'X') 
            {
                index = index + 2;
                result++;
            }
            index++;
        }
        
        return result;
        
    }
}