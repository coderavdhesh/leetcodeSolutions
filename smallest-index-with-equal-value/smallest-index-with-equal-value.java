class Solution {
    public int smallestEqual(int[] nums) {
        int minIndex = Integer.MAX_VALUE ;
        for(int i=0; i<nums.length; i++)
        {
            if(i%10 == nums[i] )
                minIndex = Math.min(i,minIndex);
        }
        return minIndex>nums.length-1 ? -1 : minIndex;
    }
}