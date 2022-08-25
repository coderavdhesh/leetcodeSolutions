class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        
        int sum = 0;
        for(int n : arr)
            sum+=n;
        
        if( sum%3 != 0)
            return false;
        
        int each = sum/3;
        int curSum = 0;
        int found = 0;
        
        for(int i =0; i< arr.length; i++){
            curSum += arr[i];
            
            if(curSum == each)
            {
                curSum =0;
                found++;
                if(found == 3)
                    break;
            }
        }
        
        return found == 3;
    }
}