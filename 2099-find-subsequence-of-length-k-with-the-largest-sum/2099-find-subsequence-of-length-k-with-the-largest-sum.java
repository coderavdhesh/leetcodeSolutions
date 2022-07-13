class Solution {
    
class Pair{
    
    int idx;
    int value;
    
    public Pair(int idx, int value)
    {
        this.idx = idx;
        this.value = value;
    }
    
}
    public int[] maxSubsequence(int[] nums, int k) {
        
        PriorityQueue<Pair> minheap = new PriorityQueue<>( (a,b) -> a.value - b.value );
        
        for(int i=0; i< nums.length; i++)
        {
            minheap.offer(new Pair(i, nums[i]) );
            
            if(minheap.size() > k)
                minheap.poll();
        }
        
        PriorityQueue<Pair> ansheap = new PriorityQueue<>( (a,b) -> a.idx -b.idx );
        
        while(!minheap.isEmpty())
            ansheap.offer(minheap.poll());
        
        int[] arr = new int[k];
        
        int i=0;
        while(!ansheap.isEmpty())
        {
            arr[i++] = ansheap.poll().value;
        }
        
        return arr;
    }
}