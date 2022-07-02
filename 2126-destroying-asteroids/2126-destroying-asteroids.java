class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        
        Arrays.sort(asteroids);
        
        long sum = mass;
        
        for(int n : asteroids)
        {
            if(sum >= n)
                sum += n;
            else
                return false;
        }
        
        return true;
    }
}