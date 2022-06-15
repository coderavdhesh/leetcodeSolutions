class Solution {
    public String freqAlphabets(String s) {
        
        String str = "";
        int i =s.length()-1;
        
        while(i>=0)
        {
            if(s.charAt(i) == '#')
            {
                int n = Integer.parseInt( s.substring(i-2, i) );
                char ch = (char) (96 + n);
                str += ch;
                i -= 3;
            }
            else
            {
                int n = Integer.parseInt( s.substring(i, i+1) );
                char ch = (char) (96 + n);
                str += ch;
                i--;
            }
        }
        
        StringBuilder sb = new StringBuilder(str);
        
        return sb.reverse().toString();
        
    }
}