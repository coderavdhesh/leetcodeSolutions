class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        ArrayList<Integer> list = new ArrayList<>();
    
        int top = 0;
        int bottom = 0;
        
        while( top < nums1.length && bottom < nums2.length)
        {
            if(nums1[top] == nums2[bottom])
            {
                list.add(nums1[top]);
                top++;
                bottom++;
            }
            else if( nums1[top] < nums2[bottom])
                top++;
            else if (nums1[top] > nums2[bottom])
                bottom++;
        }
        
        int[] arr = new int[list.size()];
        
        for(int i =0; i<list.size(); i++)
            arr[i] = list.get(i);
        
        return arr;
   }
}