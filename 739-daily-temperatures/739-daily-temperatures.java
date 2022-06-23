class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[temperatures.length];
        
        for(int i = temperatures.length-1; i>=0; i--)
        {
            if(stack.isEmpty())
                arr[i] =0;
            else if (!stack.isEmpty() && temperatures[stack.peek()] > temperatures[i] )
                arr[i] = stack.peek() - i ;
            else if( !stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i] )
            {
                while(!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i])
                    stack.pop();
                
                if(!stack.isEmpty())
                    arr[i] = stack.peek() - i;
                else
                    arr[i] = 0;
            }
            
            stack.push(i);
        }
        
        return arr;
    }
}