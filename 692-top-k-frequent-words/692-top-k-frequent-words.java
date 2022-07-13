class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String, Integer> freq = new HashMap<>();
        
        for(String s : words)
            freq.put(s, freq.get(s) == null ? 1 : freq.get(s)+1);
        
        PriorityQueue<Map.Entry<String, Integer> > minHeap =
            new PriorityQueue<>((a,b) -> a.getValue() != b.getValue() ?  a.getValue() - b.getValue() : b.getKey().compareTo(a.getKey()) ) ;
       
        
        for(Map.Entry pairs : freq.entrySet())
        {
            minHeap.offer(pairs);
            
            if(minHeap.size() > k) 
                minHeap.poll();
        }
        
        ArrayList<String> list = new ArrayList<>();
        
        
        while( !minHeap.isEmpty() )
        {
            list.add(minHeap.poll().getKey() );
        }
        
        Collections.reverse(list);
        
        return list;
    }
}