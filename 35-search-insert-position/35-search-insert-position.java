class Solution {
    public int searchInsert(int[] nums, int target) {
        
//         int low = 0;
//         int high = nums.length-1;
        
//         while(low<=high)
//         {
//             int mid = low + (high - low)/2;
            
//             if(nums[mid] == target)
//                 return mid;
//             else if(nums[mid] < target)
//                 low = mid + 1;
//             else
//                 high = mid -1;
//         }
        
        
//         return -1;
        
        
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                s=mid+1;
            else
                e=mid-1;
        }
        return s;
        
    }
}