class Solution {
    public String sortSentence(String s) {
        
        int count =0 ;
        for (String a : s.split(" "))// counting the arr size 
        {
            count++;
        }
        String[] arr = new String[count];
        
        for (String a : s.split(" "))
        {
            int n = Integer.parseInt(a.substring(a.length()-1,a.length()));
            
            arr[n-1] = a.substring(0,a.length()-1);
        }
        String str ="" ;
        
        for(String stt : arr)
        {
            str = str+" "+stt;
        }
        
        return str.trim();
    }
}