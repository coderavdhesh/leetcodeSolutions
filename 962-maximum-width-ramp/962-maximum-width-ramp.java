class Solution {
    public int maxWidthRamp(int[] nums) {
        
        // it will definately give us the TLE 
//         int max = 0;
        
//         for(int i =0; i<nums.length-1; i++)
//         {
//             for(int j = i+1; j<nums.length; j++)
//             {
//                 if(i<j && nums[i] <= nums[j])
//                     max = Math.max(max, j-i );
//             }
//         }
        
//         return max;
        
        
        // now use stack
        
        Stack<Integer> stack = new Stack<>();
        
        // lets create a monotonic stack
        for(int i =0; i< nums.length; i++)
        {
            if(stack.isEmpty() || nums[stack.peek()] > nums[i] )
                 stack.push(i);
        }
        
        int max = 0;
        
        for(int i = nums.length-1; i>=0 ; i--)
        {
            while(!stack.isEmpty() && nums[i] >= nums[stack.peek()]) 
                max = Math.max(max, i-stack.pop());
        }
        
        return max;
        
        
    }
}