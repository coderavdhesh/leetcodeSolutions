class Solution {
    public String digitSum(String s, int k) 
    {
        
        while(s.length() > k)
        {
            int mod = s.length()%k;
            String str = "";
            
            for(int i = 0; i< s.length(); i+=k)
            {
                if(i == s.length()-mod)
                    str += strsum(s.substring(i,i+mod));
                else
                    str += strsum(s.substring(i,i+k));
            }
            s=str;   
        }
        return s;
    }
    
    public String strsum(String s) 
    {
        int sum =0;
        for(int i= 0; i<s.length(); i++)
        {
            sum += Character.getNumericValue(s.charAt(i) ) ;
        }
        
        return Integer.toString(sum);
    }
}