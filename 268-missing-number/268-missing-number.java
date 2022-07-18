class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        
        int start = 0;
        int end = nums.length-1;
        
        while(start <= end)
        {
            int mid = start + (end- start)/2;
            
            if(nums[mid] > mid )
                end = mid-1;
            else
                start = mid+1;
        }
        
        return start;
    }
}