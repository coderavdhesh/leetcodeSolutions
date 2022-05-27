class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        int dy = coordinates[1][1] - coordinates[0][1];
        int dx = coordinates[1][0] - coordinates[0][0];
        
        
        for(int i = 2; i < coordinates.length; i++){
            int dy2 = coordinates[i][1] - coordinates[i - 1][1];
            int dx2 = coordinates[i][0] - coordinates[i - 1][0];
            
            if(dy * dx2 != dx * dy2){
                return false;
            }
        }
        return true;
    }
}