class Solution {
    public int findPairs(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums)
            map.put(n, map.get(n) == null? 1 : map.get(n)+1);
        
        int count =0;
        
        for(int key : map.keySet())
        {
            if((k>0 && map.containsKey(key+k) )|| (k == 0 && map.get(key)>1) )
                count++;
        }
        
        return count;
        
    }
    

}