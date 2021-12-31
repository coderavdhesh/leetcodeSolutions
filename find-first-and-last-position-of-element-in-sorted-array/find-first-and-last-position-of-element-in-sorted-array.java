class Solution {
    public int[] searchRange(int[] nums, int target) {
        // kunal is great
        
        int arr[] = {-1,-1};
        
        arr[0]= index(nums,target,true);//getting the first index
        if(arr[0]!= -1){
            arr[1]= index(nums,target,false);//getting the last index
        }
        return arr;//our indexes
        
    }
    
    //binary search of the indexes
    public int index(int nums[], int target, boolean firstIndex){
        int ans =-1;//intialise as -1 
        
        int start =0;
        int end = nums.length-1;
        
        while(start<=end)
        {
            int mid = start + ((end-start)/2);
            if(target>nums[mid])
                start = mid+1;
            else if(target < nums[mid])
                end = mid-1;
            else
            {
                ans = mid;
                if(firstIndex)
                    end = mid-1;//get back to the first half to check the element is there or not 
                else
                    start = mid+1;//get back to the last half to check the element is there or not 
            }    
        }
        return ans;
    }
}