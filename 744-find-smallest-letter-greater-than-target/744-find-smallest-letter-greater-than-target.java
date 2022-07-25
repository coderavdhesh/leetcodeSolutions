class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int start = 0;
        int end = letters.length-1;
        
        if( target >= letters[end] )
            return letters[0];
        
        char ans = ' ';
        
        while( start <= end)
        {
            int mid = start +(end -start)/2;
            
            if((int) letters[mid] == (int)target )
            {
                ans = letters[mid+1];
                start = mid+1;
            }
            else if ( (int) letters[mid] <= (int)target )
                start = mid+1;
            else
                end = mid-1;
        }
        
        return ans == ' ' ? letters[start] : ans;
    }
}