class Solution {
    public int minimumDifference(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int i =0;
        int j =0;
        
        int score = Integer.MAX_VALUE;
        
        while(j< k-1)
            j++;
        score = nums[j] - nums[i];
        
        while(j<nums.length-1)
        {
            i++;
            j++;
            
            score = Math.min(score, nums[j]- nums[i]);
        }
        
        return score;
    }
}