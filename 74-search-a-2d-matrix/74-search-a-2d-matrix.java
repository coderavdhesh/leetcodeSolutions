class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i =0 ; i< matrix.length; i++ )
        {
            int start = 0;
            int end = matrix[i].length;
            
            if(target>= matrix[i][start] && target<= matrix[i][end-1] )
                return binarySearch(matrix[i], start, end-1, target);
            else
                continue;
        }
        
        return false;
        
    }
    
    public boolean binarySearch(int[] arr, int s, int e, int target){
        
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            
            if(arr[mid] == target )
                return true;
            else if(arr[mid] < target)
                s = mid+1;
            else
                e = mid-1;
        }
        return false;
    }
}