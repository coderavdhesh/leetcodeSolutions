class Solution {
    public String firstPalindrome(String[] words) {
       
        for(String stt : words )
        {
            if(isPalindrome(stt)==true)
                return stt;
        }
        return "";
    }
    
    public boolean isPalindrome(String str)
    {
        int i =0;
        int j =  str.length()-1;
        
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}