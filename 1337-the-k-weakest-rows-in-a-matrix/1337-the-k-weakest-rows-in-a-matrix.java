class Solution {
    class Pair{
        int idx;
        int rowSum;
        
        public Pair(int idx, int rowSum)
        {
            this.idx = idx;
            this.rowSum = rowSum;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        
        PriorityQueue<Pair> maxheap = new PriorityQueue<>((a,b) -> {
            if(b.rowSum != a.rowSum)
                return b.rowSum - a.rowSum;
            return b.idx - a.idx;
            });
        
        for(int i =0 ;i< mat.length; i++)
        {
            int sum = 0;
            
            for(int j =0; j< mat[i].length; j++)
                sum += mat[i][j];
            
            maxheap.offer(new Pair(i, sum) );
            
            if(maxheap.size() > k)
                maxheap.poll();
        }
        
        int[] arr = new int[k];
        k--;
        while(!maxheap.isEmpty())
        {
            arr[k--] = maxheap.poll().idx;
        }
        
        return arr;
    }
}