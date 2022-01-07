class Solution {
    private void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public int[] sortArrayByParityII(int[] nums) {
        int evenindex = 0;
        int oddindex = 1;
        
        while(evenindex < nums.length && oddindex < nums.length)
        {
            if(nums[evenindex]%2 == 0) evenindex +=2;
            if(nums[oddindex]%2 == 1) oddindex += 2;
            
            if(evenindex < nums.length && oddindex < nums.length)
                swap(nums,evenindex,oddindex);
        }
        return nums;
    }
}