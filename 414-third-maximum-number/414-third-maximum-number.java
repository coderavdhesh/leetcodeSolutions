class Solution {
    public int thirdMax(int[] nums) {
        
        
//         Arrays.sort(nums);
        
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(int num : nums)
//         {
//             map.put(num, map.get(num)==null ? 1 : map.get(num) +1);
//         }
        
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        
        for(int num : nums)
        {
            if(!maxHeap.contains(num))
                maxHeap.offer(num);
            
            if(maxHeap.size() > 3)
                maxHeap.poll();
        }
        
        if(maxHeap.size()==2 )
            maxHeap.poll();
        
        return maxHeap.poll();
        
        
        
    }
}