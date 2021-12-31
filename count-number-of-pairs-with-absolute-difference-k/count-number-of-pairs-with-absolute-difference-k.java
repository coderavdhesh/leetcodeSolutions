class Solution {
   
    public int countKDifference(int[] nums, int k) {
        
        int count =0;
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j =i; j<nums.length; j++)
            {
                if(Math.abs(nums[i]-nums[j]) == k )
                    count++;
            }
        }
        return count;
        
//     int result = 0;
//     int last = nums.length - 1; 
//     int first = nums.length - 2;
    
//     // O(n) in time and O(1) in space
//     for (int i = nums.length - 1; last > 0; i--) {
//         if(Math.abs(nums[last] - nums[first]) == k) {
//             result++; 
//         }
        
//         if(first == 0) {
//             last--;
//         } else {
//             first--; 
//         }
//     }

//     return result;
    }
}