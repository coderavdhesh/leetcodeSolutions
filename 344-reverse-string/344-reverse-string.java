class Solution {
    public void reverseString(char[] s) {
        reverseStr(s,0);
    }
    public static void reverseStr(char[] s, int idx){
        if(idx >= s.length / 2)
            return;
        
        char temp = s[idx];
        s[idx] = s[s.length-1 - idx];
        s[s.length-1 - idx] = temp;
        reverseStr(s,idx+1);
    }
}