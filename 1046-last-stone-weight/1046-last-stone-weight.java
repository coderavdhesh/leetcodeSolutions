class Solution {
    public int lastStoneWeight(int[] stones) {
        
        /*
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
            weight = maxHeap.poll();// yaha dimag lagana pada ache se
        }
        
        
        return weight;*/
        
        // copied from discussion, same approch but the code is clean
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); // what ((a, b) -> b - a) is this? // the laternative of Collections.reverceOrder()
        
        for(int stone : stones) {
            pq.offer(stone);
        }
        
        while(pq.size() > 1) {
            pq.offer(pq.poll() - pq.poll()); 
        }
        
        return pq.poll();
        
    }
}