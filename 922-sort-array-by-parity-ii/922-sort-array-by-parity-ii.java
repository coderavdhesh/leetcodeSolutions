class Solution {
    private void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    // here starting the pointers together in same direction
    /*public int[] sortArrayByParityII(int[] nums) {
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
    }*/
    
    // here pointer moving opposite ways one from start and one from end
    public int[] sortArrayByParityII(int[] A) 
    {
        int evenIndex = 0;
        int oddIndex = A.length - 1;
        
        while(evenIndex < A.length && oddIndex > 0)
        {
            if(evenIndex < A.length && oddIndex > 0)
                swap(A, evenIndex, oddIndex);
            
            if(A[evenIndex] % 2 == 0) evenIndex += 2;
            if(A[oddIndex] % 2 == 1)  oddIndex -= 2;
        }
        return A;
    }    
    
}