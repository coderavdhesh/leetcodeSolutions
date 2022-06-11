class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] ch1 = s.toCharArray();
        Arrays.sort(ch1);
        
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);
        
        if(ch1.length != ch2.length)
            return false;
        
        for(int i=0; i<ch1.length; i++)
        {
            if(ch1[i] != ch2[i])
                return false;
        }
        
        return true;
    }
}