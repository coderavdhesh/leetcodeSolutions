class Solution {
    public int findSpecialInteger(int[] arr) {
        int appear = arr.length/4 ;
        int ans =arr[0];
        
        for(int i =0; i<arr.length; i++){
            int count =0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                    count++;
                
                if(count>appear)
                    ans = arr[i];
            }
        }
        return ans;
    }
}