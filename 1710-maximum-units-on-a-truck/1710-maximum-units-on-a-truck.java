class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
        
        int ans = 0;
        
        for(int[] a : boxTypes){
            int temp = Math.min(a[0], truckSize);
            ans += temp*a[1];
            truckSize -= temp;
            
            if(truckSize == 0)
                return ans;
        }
        
        return ans;
    }
}