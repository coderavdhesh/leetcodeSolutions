class Solution {
    public int repeatedNTimes(int[] nums) {
        
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(int i : nums)
//         {
//             map.put(i, map.get(i) == null ? 1 : map.get(i)+1);
//         }
    
//         // this line is imp.... i have learned it here for the first time
//         for(int i : map.keySet())
//         {
//             if(map.get(i) == nums.length/2){
//                 return i;
//             }
//         }
//         return 0;
        
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums)
        {
            if(!set.contains(i))
                set.add(i);
            else
                return i;
        }
        
        return 0;
    }
}