class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums) set.add(i);
        
        for(int i  : set)
        {
            if(set.contains(original))
                original *= 2;
        }
        
        return original;
    }
}