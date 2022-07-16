class Solution {
    public int maximumScore(int a, int b, int c) {
        
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        
        maxheap.add(a);
        maxheap.add(b);
        maxheap.add(c);
        
        int score =0;
        
        while( !maxheap.isEmpty() )
        {
            int top1 = maxheap.poll();
            int top2 = maxheap.poll();
            
            if(top2 == 0)
                return score;
            
            maxheap.offer(top1-1);
            maxheap.offer(top2-1);
            
            score++;
        }
        
        return 0;
    }
}