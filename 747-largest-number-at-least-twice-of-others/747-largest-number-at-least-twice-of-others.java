class Solution {
    public int dominantIndex(int[] nums) {
        
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
    
    }
}