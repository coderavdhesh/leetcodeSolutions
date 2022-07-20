class Solution {
    public int[][] merge(int[][] intervals) {
        
        // minHeap
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        
        for(int[] arr : intervals)
            heap.offer(arr);
        
        Stack<int[]> stack = new Stack<>();
        stack.push(heap.poll());
        
        while(!heap.isEmpty())
        {
            int[] a = stack.peek();
            int[] h = heap.poll();    
            
            if(a[1] >= h[0] && a[1]<= h[1])
            {
                stack.pop();
                stack.push(new int[]{a[0], h[1]} );
            }
            else if(a[1] >= h[0] && a[1] > h[1])
                continue;
            else
                stack.push(h);
        }
        
        int[][] ans = new int[stack.size()][1];
        
        for(int i = stack.size()-1; i>=0; i--)
        {
            ans[i] = stack.pop();
        }
        return ans;
    }
}