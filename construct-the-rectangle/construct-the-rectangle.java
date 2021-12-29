class Solution {
    public int[] constructRectangle(int area) {
        
        int j=0;
        for(int i=1; i*i<=area;i++)
        {
            if(area%i ==0)
                j = i;
        }
        int[] arr = {area/j, j};
        
        return arr;
         
    }
}