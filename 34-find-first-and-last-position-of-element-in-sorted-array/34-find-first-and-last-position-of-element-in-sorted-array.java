class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int a = firstOccurance(nums,0, nums.length-1, target);
        int b = lastOccurance(nums,0, nums.length-1, target);
        return new int[]{a,b};
    }
    
    public int firstOccurance(int[] arr, int s, int e, int target)
    {
        int index =-1;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            
            if(arr[mid] == target)
            {
                index = mid;
                e = mid-1;
            }
            else if( arr[mid] < target )
                s = mid+1;
            else
                e = mid-1;
        }
        
        return index;
    }
    
     public int lastOccurance(int[] arr, int s, int e, int target)
    {
        int index =-1;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            
            if(arr[mid] == target)
            {
                index = mid;
                s = mid +1;
            }
            else if( arr[mid] < target )
                s = mid+1;
            else
                e = mid-1;
        }
        
        return index;
    }
}