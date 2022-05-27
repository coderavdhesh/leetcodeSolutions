class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr)
        {
            map.put(i, map.get(i) == null ? 1 : map.get(i)+1);
        }
        
        // this line is important
        HashSet<Integer> uniqueValues = new HashSet<Integer>(map.values());
        
        return (uniqueValues.size() == map.size()) ? true : false;
      
    }
}