class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 1)
            return strs[0];
        
        for( int i =0; i<strs[0].length(); i++)
        {
            for(int j =0; j<strs.length; j++)
            {
                if(strs[j].indexOf( strs[0].substring(0,i+1) ) != 0)
                    return strs[0].substring(0,i);
                
                // if(i == strs[0].length()-1)
                //     return strs[0];
            }
        }
        return strs[0];
        
    }
}