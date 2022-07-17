class Solution {
    public int countLargestGroup(int n) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int max =0;
        
        for(int i =1; i<= n; i++)
        {
            int m = i;
            int sum = 0;
            while( m > 0)
            {
                int temp = m%10;
                sum += temp;
                m /= 10;
            }
            
            map.put(sum, map.get(sum) == null ? 1 : map.get(sum)+1);
            max = Math.max(max, map.get(sum));
        }
        
        int ans = 0;
        for(int key : map.keySet())
        {
            if(map.get(key) == max)
                ans++;
        }
        return ans;
    }
}