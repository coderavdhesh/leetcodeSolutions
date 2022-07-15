class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> minheap = new PriorityQueue<>(Collections.reverseOrder());
        int minStones = 0;
        int totalStones =0;
        
        for(int n : piles)
        {
            minheap.offer(n);
            totalStones += n;
        }
        
        while( k> 0)
        {
            int num = minheap.poll();
            int removal = (int)Math.floor(num/2);
            minStones += removal;
            minheap.offer(num - removal);
            k--;
        }
        
        System.out.println(minheap);
        
        return totalStones - minStones;
    }
}