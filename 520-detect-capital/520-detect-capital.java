class Solution {
    public boolean detectCapitalUse(String word) {
         
        String str1 = word.toUpperCase();//USA
        
        String str2 = word.toLowerCase();//leetcode
        
        String str3 = word.substring(0,1).toUpperCase() + word.substring(1,word.length()).toLowerCase() ;//Google
    
        
        return (word == str1 || word == str2 || word.equals(str3));
        
    }
}