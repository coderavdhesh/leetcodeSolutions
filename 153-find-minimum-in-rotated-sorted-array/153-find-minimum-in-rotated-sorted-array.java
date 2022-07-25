class Solution {
    public int findMin(int[] nums) {
        
         int pivot = peek(nums);
        
        if(pivot == 0)
            return nums[1];
        
        return pivot == nums.length ? nums[0] : nums[pivot+1];
        
    }
    
    public int peek(int[] arr)
    {
        int start =0;
        int end = arr.length-1;

        while(start<=end)
        {
            int mid = start +(end-start)/2;

            if(mid<arr.length-1  && arr[mid]>arr[mid+1])
                return mid;
            if(mid>0 && arr[mid]<arr[mid-1])
                return mid-1;
            if(arr[mid]>=arr[0])
                start = mid+1;
            else
                end=mid-1;
        }
        return start;
        
    }
    
}