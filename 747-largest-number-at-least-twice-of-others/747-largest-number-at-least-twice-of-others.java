class Solution {
    public int dominantIndex(int[] nums) {
        
        // this code is having O(n) but space is not satisfactory
    
        if(nums.length < 2)
            return 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i : nums)
        {
            minHeap.offer(i);
            
            if(minHeap.size()>2)
                minHeap.poll();
        }
        
        int temp = minHeap.poll();
        int max = minHeap.peek();
        
        int index = -1;
        
        for(int i=0 ; i<nums.length; i++)
        {
            if(nums[i] == max)
                index = i;
        }
        
        return (max >= temp+temp) ? index : -1;
        
        
        // this brute force will not work for few cases....
        /* 
        if(nums.length < 2)
            return 0;
        
        int max1 = nums[0];
        int max2 = Integer.MIN_VALUE;
        int index = -1;
        
        for(int i =0; i<nums.length; i++)
        {
            if(nums[i] > max1)
            {
                int temp = max1;
                max1 = nums[i];
                max2 = temp;
                
                index = i;
            }
            if(nums[i] > max2 && nums[i]< max1)
                max2 = nums[i];
        }
        
        return (max1 >= max2 + max2) ? index : -1; */
    
    }
}