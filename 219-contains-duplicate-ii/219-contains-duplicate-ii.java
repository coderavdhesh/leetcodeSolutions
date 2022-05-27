class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // cpoied solution... mere ko nahi aa raha tha
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();

        for(int i =0;i<nums.length;i++)
        {
            if(m.containsKey(nums[i]))
            {
               if(Math.abs(i-m.get(nums[i]))<=k)
                   return true;
            }
            m.put(nums[i],i);
        }

        return false;
    }
}