class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack();
        
        // ekk baar che see delh lioo yee wala ques ,,,, mera bhi same logic tha , kahi fas raha tha buss... then i copied this code for discussion
        
        for(int num : asteroids){
            while (!stack.isEmpty() && num < 0 && stack.peek() > 0 && stack.peek() < -num)
                stack.pop();
            if(!stack.isEmpty() && num < 0  && stack.peek() == -num)
                stack.pop();
            else if(!stack.isEmpty() && num < 0  && stack.peek() > -num)
                continue;
            else
                stack.push(num);
        }
        
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; --i)
            result[i] = stack.pop();
        
        return result;
        
    }
}