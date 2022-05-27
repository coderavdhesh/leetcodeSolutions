class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr)
        {
            map.put(i, map.get(i) == null ? 1 : map.get(i)+1);
        }
        
        // this line is important
        //HashSet<Integer> uniqueValues = new HashSet<Integer>(map.values());
        
        Set<Integer> uniqueValues = new HashSet<>();
        for (int i : map.keySet()) {
            if (uniqueValues.contains(map.get(i))) {
                return false;
            }
            uniqueValues.add(map.get(i));
        }
        
        
        return (uniqueValues.size() == map.size()) ? true : false;
      
    }
}