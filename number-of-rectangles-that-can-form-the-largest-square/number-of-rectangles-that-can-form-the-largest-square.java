class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        
        int n = rectangles.length;
        int maxWidth = 0;
        int count = 0;
        
        int[] width = new int[n];
        
        for(int i=0; i< n ;i++) {
            width[i] = Math.min(rectangles[i][0], rectangles[i][1]);
            maxWidth = Math.max(width[i], maxWidth);
        }
        
        for(int element : width)
        {
            if(element == maxWidth)
                count++;
        }
        return count;
    }
}