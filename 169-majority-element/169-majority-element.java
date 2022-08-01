class Solution {
    public int majorityElement(int[] nums) {
        
        // this code is having O(N) time 
        
        // morre algo
        
        int ele = 0;
        int cnt = 0;
        
        for(int i=0; i< nums.length; i++)
        {
            if(cnt == 0)//get the element
                ele = nums[i];
            
            if( ele == nums[i])
                cnt++;
            else
                cnt--;
        }
        
        return ele;
    }
}