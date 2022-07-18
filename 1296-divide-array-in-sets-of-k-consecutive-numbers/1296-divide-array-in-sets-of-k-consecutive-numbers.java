class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        
        if(nums.length%k != 0 || nums.length == k)
            return false;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        for(int n : nums)
            heap.offer(n);
        
        while(!heap.isEmpty())
        {
            int currVal = heap.poll();
            
            for(int i =1; i<k; i++)
                if( !heap.remove(currVal + i))
                    return false;
        }
        
        return true;
        
    }
}