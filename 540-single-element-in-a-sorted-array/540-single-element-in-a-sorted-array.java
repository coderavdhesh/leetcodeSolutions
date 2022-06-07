class Solution {
    public int singleNonDuplicate(int[] nums) {
        
//         int start =0;
//         int end = nums.length-1;
        
//         while(start< end)
//         {
//             int mid = start + (end-start)/2;
            
//             if(nums[mid] != nums[mid-1] && nums[mid]!= nums[mid+1])
//                 return nums[mid];
//             else if (nums[mid] >= nums[mid-1] && nums[mid+1] >= nums[mid])
//                 end = mid-1;
//             else
//                 start = mid+1;
//         }
        
//         return -1;
        
        int Xor = 0;
        
        for(int i : nums)
        {
            Xor ^= i;
        }
        
        return Xor;
        
    }
}