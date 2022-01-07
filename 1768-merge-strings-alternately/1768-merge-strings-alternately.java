class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        
        // NOTE ::::::::
        // here the Stringbilder is faster than the String method ;;;
        // beCAUSE IT NOT CREATING NEW STRING AGIAN AND AGAIN
        
        
        // here the String builder used 
        int i=0, j=0, k=0;
        StringBuffer sb = new StringBuffer();
        while(i<word1.length() && j<word2.length())
            if(k++%2==0) 
                sb.append(word1.charAt(i++));
            else 
                sb.append(word2.charAt(j++));
        while(i<word1.length()) 
            sb.append(word1.charAt(i++));
        while(j<word2.length()) 
            sb.append(word2.charAt(j++));
        
        return sb.toString();
        
        
        // normal extra string use 
        /*String str = "";
        int i =0, j=0;
        int k =0;
        while(i<word1.length() && j<word2.length())
        {
            if(k%2 ==0) 
                str += word1.charAt(i++);
            else
                str += word2.charAt(j++);
            
            k++;
        }
        while(i<word1.length())
            str += word1.charAt(i++);
        while(j<word2.length())
            str += word2.charAt(j++) ;
        
        
        return str;*/
    }
}