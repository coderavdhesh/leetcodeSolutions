class Solution {
    public int titleToNumber(String columnTitle) {
        
        if(columnTitle==null)
            return -1;
        
        int ans = 0;
        
        for(int i=0;i<columnTitle.length();i++)
        {
             ans*=26;
             ans+=columnTitle.charAt(i)- 64 ;
        }
        
        return ans;
        
    }
}