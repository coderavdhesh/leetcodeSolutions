class Solution {
    public int lastStoneWeight(int[] stones) {
        
        if(stones.length < 2)
            return stones[0];
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int wt : stones)
            maxHeap.offer(wt);
        
        int weight = maxHeap.peek();;
        int x = maxHeap.poll();//x
        
        while (maxHeap.size() > 0) {
            int y = maxHeap.poll(); //y
            weight = Math.abs(y-weight);
            
            maxHeap.offer(weight);
            weight = maxHeap.poll();
        }
        
        
        return weight;
        
    }
}