class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        
        PriorityQueue<int[]> maxheap = 
            new PriorityQueue<>((a,b) -> (b[0]*a[1] -a[0]*b[1]) );
        
        for(int i =0 ; i<arr.length; i++)
        {
            for(int j =i+1; j< arr.length; j++)
            {
                maxheap.offer(new int[]{arr[i], arr[j]});
                
                if(maxheap.size() >k)
                    maxheap.poll();
            }
        }
        return maxheap.poll();
    }
}