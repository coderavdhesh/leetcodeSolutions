class Solution {
    public void reverseString(char[] s) {
        recursion( s, 0, s.length-1);
    }
    
    public void recursion(char[] arr, int start, int last)
    {
        if(start > last)
            return;
        
        char temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;
        
        recursion(arr, start+1, last-1);
    }
}