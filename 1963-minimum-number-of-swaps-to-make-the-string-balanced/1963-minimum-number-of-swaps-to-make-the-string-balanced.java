class Solution {
    public int minSwaps(String s) {
        
//         Stack<Character> stack = new Stack<>();
        
//         for(int i =0; i<s.length(); i++)
//         {
//             char ch = s.charAt(i);
            
//             if(ch =='[')
//                 stack.push(ch);
//             else
//             {
//                 if(!stack.isEmpty() && stack.peek() == '[')
//                     stack.pop();
//                 else
//                     stack.push(ch);
//             }
//         }
        
//         return (int)Math.ceil(stack.size()/4.0);
        
        
        
        // coppied code hain ye wala
        int open = 0, close = 0, unbalanced = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '[') open++;
            else {
                if(open > close) // i.e we have an extra open [ to be used in a pair
                    close++;
                else
                    unbalanced++;
            }
        }
        return (unbalanced+1)/2;
        
    }
}