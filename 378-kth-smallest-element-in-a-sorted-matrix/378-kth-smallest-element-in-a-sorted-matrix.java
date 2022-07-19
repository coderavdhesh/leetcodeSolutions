class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b) -> b-a);
        
        for(int i =0; i< matrix.length; i++)
        {
            for(int n : matrix[i])
            {
                maxheap.offer(n);
                
                if(maxheap.size() > k)
                    maxheap.poll();
            }
        }
        
        return maxheap.poll();
    }
}