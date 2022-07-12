class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums)
            map.put(num, map.get(num) == null ? 1 : map.get(num) +1);
        
        // now we get the frequency of every element in map;
        
        PriorityQueue<Map.Entry<Integer, Integer> > minHeap = new PriorityQueue<>((a,b) -> a.getValue()- b.getValue() );
        
        for(Map.Entry pairs : map.entrySet() )
        {
            minHeap.offer(pairs);
            
            if(minHeap.size() > k)
                minHeap.poll();
        }
        
        
        int[] arr = new int[k];
        
        for(int i =0; i<k; i++)
            arr[i] = minHeap.poll().getKey();
        
        
        return arr;
        
        
       
    }
    
}