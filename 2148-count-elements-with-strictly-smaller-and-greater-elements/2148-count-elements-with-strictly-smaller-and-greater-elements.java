class Solution {
    public int countElements(int[] nums) {
        
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int count =0;
        
        for(int n : nums){
            if( n != max && n!= min)
                count++;
        }
        
        return count;
    }
}