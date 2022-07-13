class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        // with the use of int[][] pairs
        
        if(k == points.length) 
            return points;
        
        PriorityQueue< int[] > maxheap = 
            new PriorityQueue<>( (a,b) -> (b[0]*b[0]+ b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]) );
        
        for(int[] pairs : points )
        {
            maxheap.offer(pairs);
            
            if(maxheap.size() > k)
                maxheap.poll();
        }
        
        return maxheap.toArray(new int[0][0]);
        
    }
}