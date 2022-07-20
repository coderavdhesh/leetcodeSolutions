class Solution {
    public int numRabbits(int[] answers) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int n : answers)
            map.put(n, map.get(n)==null? 1 : map.get(n)+1);
        
        int rabbits =0;        
        for(int key : map.keySet())
        {
            int rab = key+1;
            int div = map.get(key)/ rab;
            int mod = map.get(key)% rab;
            
            if(mod == 0)
                rabbits += (div*rab);
            else
                rabbits += (div*rab) + (rab);
            
            
            
        }
        
        return rabbits;
    }
}