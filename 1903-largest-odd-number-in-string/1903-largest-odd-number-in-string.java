class Solution {
    public String largestOddNumber(String num) {
        
        int oddIndex = -1;
        
        for(int i = num.length()-1 ; i>=0; i-- )
        {
            if(Character.getNumericValue(num.charAt(i))%2 ==1 )
            {oddIndex = i;break;}
        }
        
        return oddIndex != -1 ? num.substring(0,oddIndex+1) : "";
        
    }
}