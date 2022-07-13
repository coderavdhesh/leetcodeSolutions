class Solution {
    public boolean divideArray(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums)
            map.put(n, map.get(n) == null ? 1 : map.get(n)+1 );
        
        for(int key : map.keySet() )
            if(map.get(key)%2 != 0)
                return false;
        
        return true;
        
    }
}