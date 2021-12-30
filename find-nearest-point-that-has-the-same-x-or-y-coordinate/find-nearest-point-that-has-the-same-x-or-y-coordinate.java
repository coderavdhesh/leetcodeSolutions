class Solution {
    
    public int abs(int x, int y )
    {
        return (x-y)>0 ? (x-y) : (y-x);
    }
    
    public int nearestValidPoint(int x, int y, int[][] points) {
    
        int n=points.length;
        int min= Integer.MAX_VALUE;
        int ind=-1;
        for(int i=0;i<n;i++){
            if(points[i][0]==x || points[i][1]==y){
                int dis= abs(points[i][0],x)+ abs(points[i][1],y);
                if(dis<min){
                    ind=i;
                    min=dis;
                }
            }
        }
        return min==Integer.MAX_VALUE ? -1 : ind;
    }
}