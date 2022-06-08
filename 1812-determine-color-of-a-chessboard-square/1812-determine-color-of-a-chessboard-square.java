class Solution {
    public boolean squareIsWhite(String coordinates) {
        
        int ans = (int) coordinates.charAt(0) + Character.getNumericValue(coordinates.charAt(1));
        
        return (ans)%2 ==0 ? false : true;
        
    }
}