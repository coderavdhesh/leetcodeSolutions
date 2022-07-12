class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i =0 ; i< s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.get(ch)== null ? 1 : map.get(ch)+1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer> > maxHeap = 
            new PriorityQueue<>( (a,b) -> b.getValue() - a.getValue() );
        
        for(Map.Entry pairs : map.entrySet() )
            maxHeap.offer(pairs);
        
        StringBuilder str = new StringBuilder();
        
        while( !maxHeap.isEmpty() )
        {
            char c = maxHeap.peek().getKey();
            int k = maxHeap.poll().getValue();
            
            for(int i =0; i< k; i++)
                str.append(c);
        }
        
        return str.toString();
    }
}