class Solution {
    public int[] shuffle(int[] nums, int n) {

      
        
        
        int[] output = new int[2*n];
        int k=0;
        for(int i=0; i<n; i++) 
        {
            output[k++]=nums[i];
            output[k++]=nums[i+n];
        }
    
        return output;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}