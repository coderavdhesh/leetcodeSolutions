class Solution {
    public int findPairs(int[] nums, int k) {
        
//         Arrays.sort(nums);
//         int count =0;
        
//         for(int i =0; i<nums.length-1; i++)
//         {
//             if(i == 0 || (nums[i] != nums[i-1] && i!=0) )
//             {
//                 if(binarySearch(nums, i+1, nums.length-1, nums[i]+k))
//                     count++;
//             }  
//         }
//         return count;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums)
            map.put(n, map.get(n) == null? 1 : map.get(n)+1);
        
        int count =0;
        
        for(int key : map.keySet())
        {
            if((k>0 && map.containsKey(key+k) )|| (k == 0 && map.get(key)>1) )
                count++;
        }
        
        return count;
        
    }
    
//     public boolean binarySearch(int[] arr, int s, int e, int target){
        
//         while(s<=e)
//         {
//             int mid = s +(e-s)/2;
            
//             if(arr[mid] == target)
//                 return true;
//             else if(arr[mid] < target)
//                 s = mid+1;
//             else 
//                 e = mid-1;
//         }
//         return false;
//     }
}