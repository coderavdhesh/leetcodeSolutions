class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums)
        {
            map.put(i, map.get(i)== null ? 1 : map.get(i)+1 );
            
            if(map.get(i) > nums.length/3  && !list.contains(i) )
                list.add(i);
        }
        
        return list;
        
    }
}