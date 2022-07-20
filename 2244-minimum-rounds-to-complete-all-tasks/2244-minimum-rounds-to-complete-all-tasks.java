class Solution {
    public int minimumRounds(int[] tasks) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int n : tasks)
            map.put(n , map.get(n) == null ? 1 : map.get(n)+1);
        
        int rounds =0;
        
        for(int task : map.keySet())
        {
            if(map.get(task) == 1)
                return -1;
            
            int twosRound = map.get(task)/2 +( map.get(task)%2 != 0 ? 1 : 0);
            int threesRound = map.get(task)/3 +( map.get(task)%3 != 0 ? 1 : 0);
            
            rounds += Math.min(twosRound, threesRound);
        }
        
        return rounds;
    }
}