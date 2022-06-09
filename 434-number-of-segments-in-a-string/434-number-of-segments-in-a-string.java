class Solution {
    public int countSegments(String s) {
        
        if(s.length() == 0)
            return 0;
        
        String[] arr = s.trim().split("\s+");
        
        if(arr.length == 1 && arr[0] == "")
            return 0;
    
        return arr.length;
        
    }
}