class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        // see basic approch is ... apply nested loop O(N^2)
        
        /*but apply binary to make time O((n1+n2).logn2) ----which is O(nlogn)
        and space O(logn2)*/
        
        int ans = 0;
        if(arr1 == null || arr2 == null)
            return ans;
        
        Arrays.sort(arr2);      //n2.logn2
        
        for(int element : arr1){//n1.logn2
            if(bSearch(element, arr2, d, 0, arr2.length-1)){
                ans++;
            }
        }
        return ans;
        
    }
    
    boolean bSearch(int n, int[] arr2, int d, int l, int r) {
        if(r>=l){
            int mid = l + (r-l)/2;
            int m = Math.abs(n - arr2[mid]);
            if(m <= d){
                return false;
            }
            if(n < arr2[mid] ){
                return bSearch(n, arr2, d, l, mid-1);
            } else{
                return bSearch(n, arr2, d, mid+1, r);
            }
        }
        return true;
    }
}