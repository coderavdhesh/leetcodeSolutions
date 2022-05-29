class Solution {
    public String kthDistinct(String[] arr, int k) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String str : arr)
        {
            map.put(str, map.get(str) == null ? 1 : map.get(str)+1 );
        }
        
        for(String st : arr)
        {
            if(map.get(st) == 1)
                k--;
            
            if(k==0)
                return st;
        }
        
        return "";
    }
}