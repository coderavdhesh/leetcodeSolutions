class Solution {
    public int[] replaceElements(int[] arr) {
        
        // nice approch 
        int max= -1;  // O(n)
        for(int i=arr.length-1; i>=0; i--)
        {
            int temp = arr[i];
            arr[i] = max;
            if(temp>max)
                max= temp;
        }
        return arr;
    }
}