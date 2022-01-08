class Solution {
    public void shift(int[] arr, int left, int right)
    {
        while(right<left)
        {
            arr[left] = arr[left-1];
            left--;
        }
        
    }
    public void duplicateZeros(int[] arr) {
        
        int i =0;
        
        while(i<arr.length)
        {
            if(arr[i]==0)
            {
                shift(arr,arr.length-1,i+1);
                if(i!=arr.length-1)
                    arr[i+1] =0;
                i = i+2 ;
            }
            else
                i++;
        }
        
    }
}