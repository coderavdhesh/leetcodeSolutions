class Solution {
    public int maximumProduct(int[] nums, int k) {
        
        int mod=(int)Math.pow(10,9)+7;
        PriorityQueue<Integer> heap = new PriorityQueue<>();//min heap
        
        for(int i : nums)
            heap.offer(i);
        
        while(k>0)
        {
            int temp = heap.poll();
            heap.offer(temp+1);
            k--;
        }
        
        long product = 1;
        
        while(!heap.isEmpty())
        {
            product = (product*heap.poll() )%mod;
        }
        
        product = product%mod;
        
        return (int) product;
        
    }
}