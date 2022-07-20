class Solution {
    public int findPairs(int[] nums, int k) {
        
        Arrays.sort(nums);
        int count =0;
        
        for(int i =0; i<nums.length-1; i++)
        {
            if(i == 0 || (nums[i] != nums[i-1] && i!=0) )
            {
                if(binarySearch(nums, i+1, nums.length-1, nums[i]+k))
                    count++;
            }  
        }
        return count;
        
    }
    
    public boolean binarySearch(int[] arr, int s, int e, int target){
        
        while(s<=e)
        {
            int mid = s +(e-s)/2;
            
            if(arr[mid] == target)
                return true;
            else if(arr[mid] < target)
                s = mid+1;
            else 
                e = mid-1;
        }
        return false;
    }
}