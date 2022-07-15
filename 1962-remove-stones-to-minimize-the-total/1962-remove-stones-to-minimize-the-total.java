class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b) -> b-a);
        
        for(int n : piles)
            minheap.offer(n);
        
        while( k> 0)
        {
            int num = minheap.poll();
            int removal = (int)Math.floor(num/2);
            minheap.offer(num - removal);
            k--;
        }
        
        int minStones = 0;

        while(!minheap.isEmpty())
            minStones += minheap.poll();
        
        return  minStones;
    }
}