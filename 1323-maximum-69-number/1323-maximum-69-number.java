class Solution {
    public int maximum69Number (int num) {
        
        String str = num + "";
        
        char[] ch = str.toCharArray();
        
        for(int i = 0; i<ch.length; i++){
            if(ch[i] == '6')
            {
                ch[i] = '9';
                break;
            }
        }
        
        StringBuilder s = new StringBuilder();
        
        for(char c : ch)
            s.append(c);
        
        return Integer.valueOf(s.toString());
    }
}