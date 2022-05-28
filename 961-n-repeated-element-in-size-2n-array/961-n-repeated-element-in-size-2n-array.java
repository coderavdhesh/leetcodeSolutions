class Solution {
    public int repeatedNTimes(int[] nums) {
        
        // this one is the correct solution for all the test cases
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums)
        {
            map.put(i, map.get(i) == null ? 1 : map.get(i)+1);
            
            if(map.get(i) == nums.length/2)
                return i;
        }
        return 0;
        
        
        // i think it is not a best solution although it is working 
        /*HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums)
        {
            if(!set.contains(i))
                set.add(i);
            else
                return i;
        }
        
        return 0;*/
    }
}