class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> indices = new HashMap<>();
        
        for(int i=0 ; i< nums2.length; i++)
            indices.put( nums2[i], i);
        
        System.out.println(indices);
        
        int[] greaters = new int[nums2.length];
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = nums2.length-1; i>=0; i--)
        {
            if(stack.isEmpty())
                greaters[i] = -1;
            else if(stack.peek() > nums2[i] && stack.size()> 0)
            {
                greaters[i] = stack.peek();
            }
            else if(stack.peek() < nums2[i] && stack.size()> 0)
            {
                while(stack.size()> 0 && stack.peek() <= nums2[i])
                    stack.pop();
                
                if(stack.isEmpty())
                    greaters[i] = -1;
                else
                    greaters[i] = stack.peek();
            }
            stack.push(nums2[i]);
        }
        
        System.out.println(Arrays.toString(greaters));
        
        // now traverse the num1 to get the answer
        
        for(int i =0; i< nums1.length; i++)
        {
            int index = indices.get(nums1[i]);
            
            nums1[i] = greaters[index];
        }
        
        return nums1;
    }
}