class Solution {
    public int fillCups(int[] amount) {
        
        PriorityQueue<Integer> maxheap = 
            new PriorityQueue<>(Collections.reverseOrder());
        
        for(int n : amount)
            maxheap.offer(n);
        
        int sum =0;
        
        while( maxheap.peek() != 0) {
            
            int v1 = maxheap.poll();
            int v2 = maxheap.poll();
            
            v1--;
            v2--;
            sum++;
            
            if(v1 > 0) maxheap.offer(v1);
            else maxheap.offer(0);
            
            if(v2 > 0) maxheap.offer(v2);
            else maxheap.offer(0);
        }
        
        return sum;
    }
}