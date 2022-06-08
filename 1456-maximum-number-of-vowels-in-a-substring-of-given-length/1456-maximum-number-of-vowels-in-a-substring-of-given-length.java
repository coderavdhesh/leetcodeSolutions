class Solution {
    public int maxVowels(String s, int k) {
        
        String letters = "aeiouAEIOU";
        int vowels = 0;
        int max = Integer.MIN_VALUE;
        
        int i =0, j=0;
        
        while(j<k)
        {
            if( letters.indexOf(s.charAt(j++)) != -1 )
                vowels++;
        }
        
        max = Math.max(max, vowels);
        
        while(i<s.length()-k)
        {
            if( letters.indexOf(s.charAt(i)) != -1 )
                vowels--;
            if( letters.indexOf(s.charAt(j)) != -1 )
                vowels++;
            
            i++;
            j++;
            
            max = Math.max(max, vowels);
        }
        
        return max;
    }
}