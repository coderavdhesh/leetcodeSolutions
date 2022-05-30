class Solution {
    public int findLucky(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int max = -1;
        
        for( int i :  arr)
        {
            map.put(i , map.get(i)== null ? 1 : map.get(i)+1 );
        }
        
        for(int key : map.keySet())
        {
            if(map.get(key) == key)
             max = Math.max(max, key);
        }
        
        return max;
    }
}