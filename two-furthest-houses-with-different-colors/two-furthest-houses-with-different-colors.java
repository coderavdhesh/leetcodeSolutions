class Solution {
     
    public int maxDistance(int[] colors) {
        int first = colors[0];
        int maxDis =0;
        for(int i =0; i<colors.length; i++){
            for(int j=0; j<colors.length; j++)
            {
                if(colors[i]!=colors[j])
                {
                    int temp = (i-j)>=0 ? i-j : j-i ;
                    if(maxDis<temp)
                    maxDis = temp;}
            }
        }
        return maxDis;
    }
}