class Solution {
    public int findDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : nums)
            map.put(i, map.get(i) == null ? 1 : map.get(i) +1 );

        for(int n : map.keySet())
            if(map.get(n)>1)
                return n;
        
        return -1;
        
    }
}