class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start = 1;              // I left first (0 indexed) and last element
        int end = arr.length-2;     // to prevent indexoutofbound error
        
        while(start <= end)
        {
            int mid = start + (end -start)/2;
            
            if( arr[mid-1] < arr[mid] && arr[mid] < arr[mid+1])
                start = mid+1;
            else if ( arr[mid-1] > arr[mid] && arr[mid] > arr[mid+1])
                end = mid -1;
            else
                return mid;
        }
        
        return -1;
        
    }
}