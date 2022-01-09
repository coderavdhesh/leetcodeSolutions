class Solution {
    public int strStr(String haystack, String needle) {
//         if(needle.isEmpty())
//             return 0;
        
//         int index = haystack.indexOf(needle.charAt(0));
        
//         if(index>0)
//         {
//             if(haystack.substring(index, index +needle.length()).equals(needle))
//                 return index;
//         }
        
//         return -1;
        
        int nLength = needle.length();
        if (nLength == 0) 
            return 0;
        else if (haystack.length() < nLength) 
            return -1;
        else{
            for (int i = 0; i <= haystack.length()-nLength; i++)
            {  
                if (haystack.substring(i, i + nLength).equals(needle)) return i; 
            }
            return -1;
        }
    }
}