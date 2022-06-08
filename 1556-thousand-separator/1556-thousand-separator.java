class Solution {
    public String thousandSeparator(int n) {
        
        StringBuilder sb=new StringBuilder().append(n);
        
        if(sb.length()<4)
            return sb.toString();
        
        for(int i=sb.length()-3; i>0 ; i -=3)
        {
            sb.insert(i,".");
        }
        
        return sb.toString();
        
    }
}