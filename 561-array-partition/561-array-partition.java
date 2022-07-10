class Solution {
    public int arrayPairSum(int[] nums) {
        
        int [] arr = new int [20002];
        
        for(int i=0;i<nums.length;i++){
            arr[nums[i] + 10000]++;
        }
        
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                nums[j] = i - 10000;
                arr[i]--; j++; i--;
            } 
        }
        
        int sum = 0;
        for(int i=0;i<nums.length-1;i+=2){
            sum += Math.min(nums[i],nums[i+1]);
        }
        
        return sum;
    }
}