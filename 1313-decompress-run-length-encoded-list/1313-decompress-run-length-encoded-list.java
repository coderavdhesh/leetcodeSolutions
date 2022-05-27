class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int count = 0;
        ArrayList<Integer> output = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i = i+2)
        {
            for(int j = 0; j < nums[i]; j++)
            {            
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        for(int i = 0; i < nums.length; i = i+2)
        {
            for(int j = 0; j < nums[i]; j++)
            {            
                output.add(nums[i+1]);
            }
        }
        
        for(int i = 0; i < output.size(); i++)
        {
            answer[i] = output.get(i);
        }
        
        return answer;
    }
}