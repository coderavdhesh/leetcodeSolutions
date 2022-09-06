class Solution {
    public boolean divideArray(int[] nums) {
        
        Arrays.sort(nums);
        int xor =0;
        
        for(int i=0; i< nums.length; i+=2){
            xor = nums[i+1] ^ nums[i];
            
            if(xor!= 0)
                return false;
        }
        return true;
    }
}