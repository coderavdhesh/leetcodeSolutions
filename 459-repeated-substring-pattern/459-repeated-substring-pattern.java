class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        // i am lagging in String .... learn string again 
        
        // copied code here
         String k =s+s;     // 1.
        k=k.substring(1,k.length()-1);  //2.
        if(k.contains(s))    //3.
            return true;
        return false;    //4.
        
    }
}