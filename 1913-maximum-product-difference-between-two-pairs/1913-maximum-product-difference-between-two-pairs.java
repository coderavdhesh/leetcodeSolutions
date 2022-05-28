class Solution {
    public int maxProductDifference(int[] nums) {
        
        // this code is having nlogn time 
//         Arrays.sort(nums);
        
//         return (nums[nums.length-1]*nums[nums.length-2]) - (nums[1]*nums[0]);
        
        
        // use the min and max heap to get the O(N) time
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        
        for(int i : nums)
        {
            minHeap.offer(i);
            
            if(minHeap.size()>2)
                minHeap.poll();
            
            maxHeap.offer(i);
            
            if(maxHeap.size()>2)
                maxHeap.poll();
            
        }
        
        return (minHeap.poll() * minHeap.peek()) - (maxHeap.poll() * maxHeap.peek());
    }
}