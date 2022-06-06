class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> Intersection = new HashSet<>();
        
        for(int i : nums1)
            set1.add(i);
        
        for(int j : nums2)
            if(set1.contains(j))
                Intersection.add(j);
         
        
        int[] arr = new int[Intersection.size()];
        
        int k = 0;
        for(int i : Intersection)
            arr[k++] = i;
        
        return arr;
    }
}