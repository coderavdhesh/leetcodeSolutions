class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Arrays.sort(arr);
        
        for(int i =0; i<arr.length; i++)
        {
            int target = 2*arr[i];
            
            int left = 0;
            int right = arr.length-1;
            
            while(left<=right)
            {
                int mid = left + (right -left) /2;
                
                if(arr[mid] == target && mid != i)
                    return true;
                else if(target < arr[mid])
                    right = mid-1;
                else
                    left = mid +1;
                
            }
            
        }
        return false;
    }
}