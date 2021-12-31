class Solution {
    public List<Integer> addToArrayForm(int[] arr, int k) {
        
        List<Integer> ary = new ArrayList<Integer>();
  
        int sum = 0;
        int i=arr.length-1;
        while(i>=0 || k>0)
        {
            
            if(i>=0)
            {
                sum = (arr[i]) + (k);
                ary.add(sum%10);
                k = sum/10;
                i--;
            }
            else
            {
                ary.add(k%10);
                k/=10;
            }
        }
        Collections.reverse(ary);
        return ary;
    }
    
}