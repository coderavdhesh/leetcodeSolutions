class Solution {
    public int minimumCost(int[] cost) {
        
        int candy = 0;
        
        Arrays.sort(cost);
        int totalcost = 0;
        
        for(int i = cost.length-1; i>=0; i--)
        {
            if(candy < 2)
            {
                totalcost += cost[i];
                candy++;
            }
            else if (candy == 2)
                candy =0;
        }
        
        return totalcost;
    }
}