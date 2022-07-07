class Solution {
    public boolean isValid(String s) {
        
        if(s.length() <= 2)
            return false;
        
        Stack<Character> stack = new Stack<>();
        
        stack.push(s.charAt(0));
        stack.push(s.charAt(1));
        
        for(int i =2; i< s.length(); i++)
        {
            int flag = 0;
            char ch = s.charAt(i);
            if( ch == 'c')
            {
                if( !stack.isEmpty() && stack.size()>= 2 )
                {
                    char top = stack.pop();
                    char top_2nd = stack.peek();
                    if(top == 'b' && top_2nd == 'a')
                    {
                        flag =1;
                        stack.pop();   
                    }
                    else
                    {
                        stack.push(top);
                    }
                }   
            }  
            if(flag == 0)
                stack.push(ch);
        }
        
        return stack.isEmpty();
        
        
        // this o(1) space wala code just 89 / 94 test cases passed.
//         int count_a =0;
//         int count_b =0;
//         int count_c =0;
        
//         for(int i =0; i< s.length() ; i++)
//         {
//             char ch = s.charAt(i);
//             if(count_b > count_a)
//                 return false;
//             if(ch == 'a')
//                 count_a++;
//             else if(ch == 'b')
//                 count_b++;
//             else if(ch == 'c')
//             {
//                 if(count_a >= count_b && count_b >= count_c && count_b>0 )
//                 {
//                     count_a--;
//                     count_b--;
//                 }
//                 else
//                 {
//                     count_c++;
//                 }
//             }
//         }
        
//         return (count_a + count_b + count_c) == 0 ;
        
    }
}