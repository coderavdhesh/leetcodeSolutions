class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int s = 0;
        int e = nums.length-1;
        
        while(s <= e)
        {
            int mid = s +(e-s)/2;
            
            if( mid == nums.length-1)
                return nums[nums.length-1];
            if( mid == 0)
                return nums[0];
            
            if(mid%2 == 1)
            {
                if( nums[mid-1] == nums[mid])
                    s = mid+1;
                else if( nums[mid+1] == nums[mid])
                    e = mid-1;
                else
                    return nums[mid];
            }
            else if (mid%2 == 0 )
            {
                if( nums[mid+1] == nums[mid])
                    s = mid+2;
                else if(nums[mid-1] == nums[mid])
                    e = mid-2;
                else
                    return nums[mid];
            }
        }
        
        return nums[s];
    }
}