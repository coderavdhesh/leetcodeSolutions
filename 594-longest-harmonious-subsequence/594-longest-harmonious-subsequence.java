class Solution {
    public int findLHS(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums)
            map.put(num, map.getOrDefault(num, 0)+1);
        
        // Min Heap
        PriorityQueue<Map.Entry<Integer, Integer>> heap =
            new PriorityQueue<>((a,b) -> a.getKey() - b.getKey() );
        
        for(Map.Entry entry : map.entrySet())
            heap.offer(entry);
        
        int max = 0;
        
        while( !heap.isEmpty() )
        {
            int top = heap.peek().getKey();
            int wt = heap.poll().getValue();
            
            if( !heap.isEmpty() && (heap.peek().getKey() - top) == 1)
                max = Math.max(max, heap.peek().getValue() + wt);
        }
        
        return max;
        
    }
}