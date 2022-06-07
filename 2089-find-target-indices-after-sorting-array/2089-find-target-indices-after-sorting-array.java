class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        Arrays.sort(nums);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // boolean firstIndex = false;
        
//         for(int i =0 ;i<nums.length; i++)// O(n) time 
//         {
//             if(nums[i] == target)
//             {
//                 list.add(i);
//             }
//         }
        
        if( firstIdx(nums,target) == -1)
            return list;
        
        for(int i = firstIdx(nums,target); i<=lastIdx(nums,target); i++)
            list.add(i);
        
        return list;
    }
    
    public int firstIdx(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        
        int ans = -1;
        
        while(start<=end)
        {
            int mid = start +(end -start)/2;
            
            if(nums[mid] == target)
            {
                ans = mid;
                end = mid-1;
            }
            else if(nums[mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return ans;
    }
    public int lastIdx(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        
        int ans = -1;
        
        while(start<=end)
        {
            int mid = start +(end -start)/2;
            
            if(nums[mid] == target)
            {
                ans = mid;
                start = mid+1;
            }
            else if(nums[mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return ans;
    }
    
    
}