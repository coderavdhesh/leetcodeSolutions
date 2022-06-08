class Solution {
    public boolean squareIsWhite(String coordinates) {
        
        return ( (int) coordinates.charAt(0) + Character.getNumericValue(coordinates.charAt(1)) )%2 ==0 ? false : true;
        
    }
}