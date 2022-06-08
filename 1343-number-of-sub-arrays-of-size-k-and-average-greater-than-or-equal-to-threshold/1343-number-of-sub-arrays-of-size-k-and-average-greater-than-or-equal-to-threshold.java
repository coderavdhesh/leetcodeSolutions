class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int subarrays = 0;
        
        int i =0, j=0;
        double sum = 0;
        double Avg =0;
        
        while(j<k)
            sum += arr[j++];
        
        if(sum/k >= threshold)
            subarrays++;
        
        while(i< arr.length-k)
        {
            sum = sum -arr[i] +arr[j];
            
            i++;
            j++;
            
            if(sum/k >= threshold)
                subarrays++;
        }
        
        return subarrays;
        
    }
}