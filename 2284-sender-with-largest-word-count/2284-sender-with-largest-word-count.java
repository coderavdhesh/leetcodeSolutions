class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        
        HashMap<String, Integer> map = new HashMap<>();
        int max = -1;
        String ans = "";
        
        for(int i =0; i< senders.length; i++)
        {
            String str = senders[i];
            int count = messages[i].trim().split("\\s+").length;
            
            map.put(str, map.get(str) == null ? count : map.get(str) + count);
            
            /*int currCount = map.get(str);
            
            if(currCount > max)
            {
                max = currCount;
                ans = str;
            }
            else if ( currCount == max)
                ans = ans.compareTo(senders[i]) < 1 ? senders[i]: ans;
                // the only important line of code
                */
            
            max = Math.max(max, map.get(str));
        }
        
        PriorityQueue<String> heap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String s : map.keySet())
        {
            if(map.get(s) == max)
                heap.offer(s);
        }
        
        return heap.poll();
    }
}