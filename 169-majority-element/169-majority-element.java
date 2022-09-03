class Solution {
    public int majorityElement(int[] nums) {
        
        int ele = 0;
        int count = 0;
        
        for(int n : nums){
            
            if(count == 0)
                ele = n;
            
            if(ele == n)
                count++;
            else
                count--;
        }
        
        return ele;
    }
}