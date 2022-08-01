class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i =0;
        int j =0;
        
        while( i< nums.length && j< nums.length)
        {
            if(nums[j] == nums[i])
            {
                j++;
            }
            else
            {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}