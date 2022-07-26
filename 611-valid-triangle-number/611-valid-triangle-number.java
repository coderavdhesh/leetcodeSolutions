class Solution {
    public int triangleNumber(int[] nums) {
        
        Arrays.sort(nums);
        int count =0 ;
        for(int i =0; i< nums.length-2; i++)
        {
            for(int j = i+1; j < nums.length-1; j++ )
            {
                int index = binarySearch(nums, j+1, nums.length-1, nums[i]+ nums[j]);
                
                if(index > -1)
                {
                    int ele = index-(j+1);
                    count += ele;
                }
            }
        }

        return count;
    }
    
    public int binarySearch(int arr[], int start, int end, int target)
    {
        
        if( arr[start] > target)
            return -1;
        
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            
            if(arr[mid] >= target)
                end = mid -1;
            else
                start = mid+1;
        }
        return start;
    }
}