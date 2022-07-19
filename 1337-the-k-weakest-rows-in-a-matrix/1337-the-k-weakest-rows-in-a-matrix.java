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
            int soldiers = binarySearch(mat[i], 0, mat[i].length);
            
            maxheap.offer(new Pair(i, soldiers) );
            
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
    
    public int binarySearch(int[] arr, int s, int e)
    {
        while(s<e)
        {
            int mid = s + (e -s)/2;
            
            if( arr[mid] != 0 )
                s = mid+1;
            else
                e = mid;
        }
        return s;
    }
}