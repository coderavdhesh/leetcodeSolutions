class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        return (numaric(firstWord) + numaric(secondWord) == numaric(targetWord) ) ;
        
    }
    
    public int numaric(String str)
    {
        int n =0;
        for(int i=0; i< str.length(); i++)
        {
            n =  n*10 + ((int)str.charAt(i) - 97);
        }
        return n;
    }
}