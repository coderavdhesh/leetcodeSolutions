class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i : score)
            maxHeap.offer(i);
        
        HashMap<Integer, Integer> ranks = new HashMap<>();
        
        int j=1;
        while(maxHeap.size() >=1)
            ranks.put(maxHeap.poll(), j++);
        
        String[] arr = new String[score.length];
        
        int k = 0;
        for(int i : score)
        {
            if(ranks.get(i) == 1)
                arr[k] = "Gold Medal";
            else if (ranks.get(i) == 2)
                arr[k] = "Silver Medal";
            else if(ranks.get(i) == 3)
                arr[k] = "Bronze Medal";
            else
                arr[k] = Integer.toString(ranks.get(i));
            
            k++;
        }
        
        return arr;
    }
}