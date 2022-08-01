class Solution {
    public int majorityElement(int[] nums) {
        
        // this code is having O(N) time 
        
        Arrays.sort(nums);
        
        return nums[(nums.length)/2];
        
    }
}