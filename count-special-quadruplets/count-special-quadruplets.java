class Solution {
    public int countQuadruplets(int[] nums) {
        
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; ++i) 
        {
            for (int j = i + 1; j < n; ++j) 
            {
                for (int k = j + 1; k < n; ++k) 
                {
                    for (int c = k + 1; c < n; ++c) 
                    {
                        if ( nums[c] == nums[j] + nums[k] + nums[i] )
                        {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
        
  
}