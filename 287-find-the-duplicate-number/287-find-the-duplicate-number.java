class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
//         int start =0;
//         int end = nums.length-1;
        
//         while(start <= end)
//         {
//             int mid = start+(end- start)/2;
            
//             if(nums[mid] == mid)
//                 end = mid-1;
//             else
//                 start = mid +1;
//         }
//         return start;
        
        for(int i =0; i<nums.length-1; i++)
        {
            if( nums[i] == nums[i+1]) 
                return nums[i];
        }
        
        return 0;
    }
}