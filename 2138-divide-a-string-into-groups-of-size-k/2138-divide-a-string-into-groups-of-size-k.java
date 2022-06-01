class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        ArrayList<String> strArr = new ArrayList<>();
        
        int mod = s.length()% k;
        String modstr = "";
        
        for(int i =0; i<Math.abs(k-mod); i++)
        {
            modstr += fill;
        }
        
        for(int i =0 ; i<s.length(); i += k)
        {
            if(i == s.length() - mod)
                strArr.add(s.substring(i,i+mod) + modstr);
            else
                strArr.add(s.substring(i,i+k) );
        }        
        
        String[] arr = new String[strArr.size()];
        
        int j =0;
        for(String element : strArr)
        {
            arr[j++] = element;
        }
        
        return arr;
        
    }
}