class Solution {
    public int largestAltitude(int[] gain) {
//         int l= gain.length;
//         int[] arr = new int[l+1];
//         arr[0]=0;
//         int dude =0;
//         for(int i=0; i<l; i++)
//         {
//             dude += gain[i];
//             arr[i+1]= dude;
//         }
//         System.out.println(Arrays.toString(arr));
        
//         int max = arr[0];
//         for(int i=0; i<l+1; i++)
//         {
//              if(max<arr[i])
//                  max=arr[i];
//         }
        
//         return max;
        
        
        // more optimized and O(1) space
        for(int i=0; i<gain.length-1; i++)
        {
            gain[i+1] = gain[i] + gain[i+1];
        }
        int max =0;
        for(int element : gain)
        {
            if(element>max) 
                max = element ;
        }
        return max;
    }
}