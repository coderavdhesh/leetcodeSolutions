class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        // with the help of hashset with O(n) time -- best solution
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums) set.add(i);
        
        for(int i  : set)
        {
            if(set.contains(original))
                original *= 2;
        }
        
        // we can also sort the array first and the apply the binary search to get the element, this code will give me O(nlogn) time compexity
        
        // we can also do this with brute force approch of the double loop and it will give me the compexity of O(n*n), joo ki bekar solution hain
        
        return original;
        
        
    }
}