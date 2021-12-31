class Solution {
    public int abs(int a, int b )
    {
        return (a-b)>0 ? a-b : b-a ;
    }
    public int countKDifference(int[] nums, int k) {
        int count =0;
        
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j =i; j<nums.length; j++)
            {
                if(abs(nums[i],nums[j]) == k )
                    count++;
            }
        }
        return count;
    }
}