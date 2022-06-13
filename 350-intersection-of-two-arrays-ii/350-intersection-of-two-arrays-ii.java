class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : nums1)
            map.put(i, map.getOrDefault(i,1) +1 );
        
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        for(int i : nums2)
            map2.put(i, map2.getOrDefault(i,1) +1 );
                
        HashMap<Integer, Integer> map3 = new HashMap<>();
        
        for(int num : nums1)
        {
            if(map.containsKey(num) && map2.containsKey(num))
                map3.put(num, Math.min(map.get(num), map2.get(num)) );
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int in : map3.keySet())
        {
            int n = map3.get(in);
            for(int i=1; i<n; i++)
                list.add(in);
        }
        
        int[] arr = new int[list.size()];
        
        int j=0;
        for(int ans : list)
            arr[j++] = ans;
        
        return arr;
        
   }
}