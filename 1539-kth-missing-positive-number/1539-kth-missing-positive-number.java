class Solution {
    public int findKthPositive(int[] arr, int k) {
        
//         ArrayList<Integer> miss = new ArrayList<>();
        
//         int i=0;
//         int num = 1;
//         while(i< arr.length)
//         {
//             if(arr[i] == num )
//                 i++;
//             else
//                 miss.add(num);
            
//             num++;
//         }
        
//         int len = miss.size();
        
//         if( len < k)
//             return arr[arr.length-1] + (k -len);
//         else if(len == 0)
//             return arr[arr.length-1] + (k);
        
//         return miss.get(k-1);
        
        int s =0;
        int e = arr.length;
        
        while(s < e)
        {
            int mid = s + (e-s)/2;
            
            if(arr[mid] - (mid+1) < k)//logic yaha hain
                s = mid+1;
            else
                e = mid;
        }
        
        return s+k;
    }
}