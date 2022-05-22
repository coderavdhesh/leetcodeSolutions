class Solution {
    public int majorityElement(int[] nums) {
        
        int ans = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums)
        {
            map.put(num,map.get(num) == null ? 1 : map.get(num)+1);
            
            if(map.get(num) > nums.length/2)
                ans = num;
        }
        
        return ans;
        
    }
}