class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        
        for(int i = 0 ; i< logs.length; i++)
        {
            int id = logs[i][0];
            int time = logs[i][1];
            
            if( !map.containsKey(id) )
                map.put(id ,new HashSet<Integer>() );
        
            map.get(id).add(time) ;
        }
        
        int[] arr = new int[k];
        
        for(int id : map.keySet())
        {
             int UAM = map.get(id).size();
             arr[UAM-1]++;  
        }
        
        return arr;
    }
}