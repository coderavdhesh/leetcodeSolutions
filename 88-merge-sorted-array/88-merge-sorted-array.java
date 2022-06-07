class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
//         int i =0 , j=0;
        
//         while(i<nums1.length && j<nums2.length )
//         {
//             if(nums1[i] < nums2[j])
//                 nums1[i] = nums2[j];
            
//             if(i<nums1.length)
//                 i++;
//             if(j<nums2.length)
//                 j++;
            
//         }
        
        for(int i=m ; i<n+m; i++)
        {
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
        
        
    }
}