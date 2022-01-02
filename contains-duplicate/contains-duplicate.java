class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        TreeSet<Integer> ans = new TreeSet<>();
        
        for(int element : nums)
        {
            ans.add(element);
        }
        
        return (ans.size()<nums.length) ;
    }
}