class Solution {
    public boolean isBoomerang(int[][] points) {
        
        //x1(y2 – y3) + x2(y3 – y1) + x3(y1 – y2) = 0
        
        int a = points[0][0] * ( points[1][1] - points[2][1]);
        int b = points[1][0] * ( points[2][1] - points[0][1]);
        int c = points[2][0] * ( points[0][1] - points[1][1]);
        
        
        if(points[0][0] == points[0][1] && points[1][0] == points[1][1] && points[2][0] == points[2][1])
            return false;
        
        return (a+b+c)==0 ? false : true;
    }
}