class Solution {
    public String gcdOfStrings(String str1, String str2) {

        // Swap the paramters when needed
        if (str1.length() < str2.length())
            return gcdOfStrings(str2, str1);
        
        // Since we swap
        if (str2.length() == 0)
            return str1;

        // Check if str1 starts with str2
        if (!str1.substring(0, str2.length()).equals(str2)) {
            return "";
        }
        
        // Call the function with remaining part of str1
        return gcdOfStrings(str1.substring(str2.length()), str2);
            
    }
}