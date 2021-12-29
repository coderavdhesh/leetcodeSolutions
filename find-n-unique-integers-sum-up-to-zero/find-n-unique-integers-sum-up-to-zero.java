class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        
            int minElement = (n/2)*(-1);
            for(int i =0; i<n ;i++)
            {
                ans[i]= minElement;
                if(n%2 == 0 && minElement ==-1)
                {
                    minElement++;
                }
                minElement++;
            }
        
        
        return ans;
    }
}