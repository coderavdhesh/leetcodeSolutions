class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        ArrayList<Integer> miss = new ArrayList<>();
        
        int i=0;
        int num = 1;
        while(i< arr.length)
        {
            if(arr[i] == num )
                i++;
            else
                miss.add(num);
            
            num++;
        }
        
        int len = miss.size();
        
        if( len < k)
            return arr[arr.length-1] + (k -len);
        else if(len == 0)
            return arr[arr.length-1] + (k);
        
        return miss.get(k-1);
    }
}