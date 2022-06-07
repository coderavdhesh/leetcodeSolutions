class Solution {
    public int countHillValley(int[] arr) {
        
        int ans = 0;
        int left = arr[0];
        
        for(int i = 1; i < arr.length-1; i++)
        {
            if(arr[i] > arr[i+1] && arr[i] > left){
                ans++;
                left=arr[i];     
            }
            else if(arr[i] < arr[i+1] && arr[i] < left){
                ans++;
                left=arr[i];
            }
        }
        return ans;
    
    }
}