class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // method 1, use sort algo and the get the [array.length-k] element
        // but this code will give use nlogn time comlexity
        
        // method 2, we can use priority queue;
        
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int n : nums)
        {
            minHeap.offer(n);
            
            if(minHeap.size() > k)
                minHeap.poll();
        }
        
        return minHeap.poll();
        
    }
}