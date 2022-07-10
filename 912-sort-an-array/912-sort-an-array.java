class Solution {
    public int[] sortArray(int[] nums) {
        
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        
        for(int n : nums)
            minheap.offer(n);
        
        int i =0;
        while( !minheap.isEmpty() )
            nums[i++] = minheap.poll();
        
        return nums;
    }
}