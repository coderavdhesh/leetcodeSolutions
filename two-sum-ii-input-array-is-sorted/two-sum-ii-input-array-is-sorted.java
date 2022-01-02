class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // use two pointer the the array sorted
        
        int[] arr = {-1,-1};
        int left =0;
        int right = numbers.length-1;
        
        while(left<right)
        {
            if(numbers[left]+numbers[right]==target)
            {
                arr[0] = left+1;
                arr[1] = right+1;
            }
            if(numbers[left]+numbers[right]>target)
                right--;
            else 
                left++;
        }
        
        return arr;
       
    }
}