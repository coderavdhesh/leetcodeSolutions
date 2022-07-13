class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums)
            map.put(i, map.get(i) == null ? 1 : map.get(i)+1);
        
        PriorityQueue<Map.Entry<Integer, Integer>> minheap = 
            new PriorityQueue<>( (a,b) -> (a.getValue() == b.getValue()) ? (b.getKey() - a.getKey()) : (a.getValue() - b.getValue()) );
        
        for ( Map.Entry entry : map.entrySet()) 
            minheap.offer(entry);
        
        int[] arr = new int[nums.length];
        int j=0;
        
        while( !minheap.isEmpty() )
        {
            int k = minheap.peek().getValue();
            int val = minheap.poll().getKey();
            
            for(int i =0 ; i<k; i++)
                nums[j++] = val;
        }
        
        return nums;
    }
}