class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        
        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);
        for(int num : nums3) set3.add(num);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n : set1)
            map.put(n , map.get(n) == null ? 1 : map.get(n)+1);
        for(int n : set2)
            map.put(n , map.get(n) == null ? 1 : map.get(n)+1);
        for(int n : set3)
            map.put(n , map.get(n) == null ? 1 : map.get(n)+1);

        List<Integer> list = new ArrayList<>();
        
        for(int key : map.keySet())
        {
            if(map.get(key) > 1) 
                list.add(key);
        }
        
        return list;
        
    }
}