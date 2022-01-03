class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int element : nums)
        {
            min = Math.min(min,element);
            max = Math.max(max,element);
        }
        int j = min;
        while(j>0)
        {
            if(max%j == 0 && min%j ==0)
                break;
            j--;
        }
        return j;
    }
}