class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int arrSize = 0;
        
        for(int i : nums){
            map.put(i, map.get(i)==null ? 1 : map.get(i)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue() );
        
        for(Map.Entry pairs : map.entrySet()){
            heap.offer(pairs);
        }
        
        int[] arr = new int[k];
        int j =0;
        
        while(j<k){
            arr[j++] = heap.poll().getKey();
        }
        
        return arr;
        
    }
}