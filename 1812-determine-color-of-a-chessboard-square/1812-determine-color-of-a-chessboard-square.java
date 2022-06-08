class Solution {
    public boolean squareIsWhite(String coordinates) {
        
        int a = (int) coordinates.charAt(0);
        int b = Character.getNumericValue(coordinates.charAt(1));
        
        return (a+b)%2 ==0 ? false : true;
        
    }
}