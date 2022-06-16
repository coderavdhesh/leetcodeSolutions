class Solution {
    public int countKDifference(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums)
            map.put(i, map.get(i) == null ? 1 : map.get(i)+1);
        
        int count =0; 
        
        for(int num : nums)
        {
            int val = num + k;
            if(map.containsKey(val))
                count += map.get(val);
        }
        
        return count ;
        
    }
}