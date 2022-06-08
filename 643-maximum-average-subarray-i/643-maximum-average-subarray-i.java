class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int i =0, j=0;
        double sum =0;
        
        while(j < k)
            sum += nums[j++];
        
        double Avg = sum / k;
        
        while(j<nums.length)
        {
            sum = sum - nums[i] + nums[j];
            i++;
            j++;
            
            Avg = Math.max(Avg, sum/k);
        }
        
        return Avg;
        
    }
}