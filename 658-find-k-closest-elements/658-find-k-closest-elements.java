class Solution {
    public class Pair{
    int key;
    int num;
    Pair(int key,int num) {
        this.key = key;
        this.num = num;    
    }  
}
    
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Pair> maxHeap = new PriorityQueue<Pair>(new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                if (b.key == a.key) return b.num - a.num;
                return b.key - a.key;
            }
        });
        
        for(int n : arr)
        {
            maxHeap.offer( new Pair( Math.abs(x- n), n ) );
            
            if(maxHeap.size() > k)
                maxHeap.poll();
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i =0; i< k; i++)
                list.add(maxHeap.poll().num);
        
        Collections.sort(list);
        
        return list;
        
    }
}