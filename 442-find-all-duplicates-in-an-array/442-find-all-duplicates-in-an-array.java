class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int n : nums)
            map.put(n, map.get(n)==null? 1 : map.get(n)+1 );
        
        for(int key : map.keySet() )
            if(map.get(key) == 2)
                list.add(key);
        
        return list;
        
    }
}