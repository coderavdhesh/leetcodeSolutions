class Solution {
    public int[] findErrorNums(int[] nums) {
        
        cyclicSort(nums);
        
        for(int i =0; i< nums.length; i++){
            if(nums[i] != i+1)
                return new int[]{nums[i], i+1};
        }
        
        return new int[]{};
    }
    
    public void cyclicSort(int[] arr) {
        
        int i =0 ;
        while(i<arr.length){
            if( arr[i] != i+1 && arr[i] != arr[arr[i]-1])
                swap(arr,i,arr[i]-1);
            else
                i++;
        }
    }
    
    public void swap(int[] arr, int left, int right)
    {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp ;
    }
}