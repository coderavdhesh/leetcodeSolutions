class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        // this code is having 0(n*n) time and O(1) space
        // Please upvote this code is you find it help full
        
        // if there is single string(element) in a array, return it
        if(strs.length == 1)
            return strs[0];
        
        // now traverse every String
        for( int i =0; i<strs[0].length(); i++)
        {
            //this loop is for ith string in array
            for(int j =0; j<strs.length; j++)
            {
                // here i am checking is every string having substring for 0 to i+1
                if(strs[j].indexOf( strs[0].substring(0,i+1) ) != 0)
                    return strs[0].substring(0,i);
                // if it is not have that sub string return the substring(0,i)
            }
        }
        
        return strs[0];
        
    }
}