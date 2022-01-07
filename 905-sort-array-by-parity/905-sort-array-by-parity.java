class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i =0;
        int j = nums.length-1;
        
        while(i<j)
        {
            if(nums[i]%2 == 0) i++;
            if(nums[j]%2 == 1) j--;
            
            if(i<j)
                swap(nums,i,j);
        }
        
        return nums;
    }
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}