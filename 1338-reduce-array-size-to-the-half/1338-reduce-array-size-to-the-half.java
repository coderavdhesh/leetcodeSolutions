class Solution {
    public int minSetSize(int[] arr) {
        
        int half = arr.length/2;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : arr)
            map.put(i, map.get(i) == null ? 1 : map.get(i)+1 );
        
        PriorityQueue<Map.Entry<Integer, Integer>> maxheap =
            new PriorityQueue<>( (a,b) -> b.getValue() - a.getValue() );
        
        for(Map.Entry entry : map.entrySet())
            maxheap.offer(entry);
        
        int reqhalf = 0;
        int count =0;
        while(reqhalf < half )
        {
            int num = maxheap.peek().getKey();
            int frq = maxheap.poll().getValue();
            
            reqhalf += frq;
            count++;
        }
        
        return count;
    }
}