class Solution {
    public void rotate(int[] nums, int k) {
        
      // while(k>0){      // O(N^2) ... TLE Error
      //   int temp = nums[nums.length-1];
      //   for(int i=nums.length-1; i>0; i--)
      //   {
      //       nums[i]=nums[i-1];
      //   }
      //   nums[0] = temp;
      //   k--;
      //   }
        
        
//         if(nums.length <2)
//             return;
        
//         int arr[] = new int[k];
//         int j=0;
//         for(int i=nums.length-k; i<nums.length; i++)
//         {
//             arr[j] = nums[i];j++;
//         }
        
//         int n = nums.length-1;
//         for(int i=nums.length-1-k; i>=0;i--)
//         {
//             nums[n] = nums[i];n--;
//         }
//         for(int i=0; i<k; i++)
//         {
//             nums[i] = arr[i];
//         }
        
        
        
        // int temp;\
        
        k = k% nums.length;
        reverse(nums,0,nums.length-1-k);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
        

        
    }
    
    public int[] reverse(int[] arr, int left, int right)
    {
        if(left>right)
            return arr;
        
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        return reverse(arr,left+1, right-1);
    }
    
}