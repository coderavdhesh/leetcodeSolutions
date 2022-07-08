class Solution {
    public int minOperations(int[] nums) {
        
        int steps =0 ;
        
        for(int i = 1 ; i < nums.length; i++)
        {
            if(nums[i] <= nums[i-1])
            {
                int diff = nums[i-1]- nums[i];
                steps +=  (diff +1);
                
                nums[i] = nums[i] + diff+1; 
            }
        }
        
        System.out.print(Arrays.toString(nums) );
        
        return steps;
        
    }
}