class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        HashMap< int[] ,Integer> map = new HashMap<>(); 
        
        for(int i =0; i< points.length; i++)
        {
            int num = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            map.put( new int[]{ points[i][0], points[i][1] } , num);
        }
        
        PriorityQueue< Map.Entry< int[] , Integer>> maxheap = 
            new PriorityQueue<>( (a,b) ->  b.getValue() - a.getValue() );
        
        for(Map.Entry entry : map.entrySet() )
        {
            maxheap.offer(entry);
            
            if(maxheap.size() > k)
                maxheap.poll();
        }
        
        
        
        int[][] arr = new int[k][2];
        
        for(int i = 0 ; i<k ;i++)
            arr[i] = maxheap.poll().getKey() ;
        
        return arr;
        
    }
}