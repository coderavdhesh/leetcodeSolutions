class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i : nums1)
            set1.add(i);
        
        for(int j : nums2)
            set2.add(j);
        
        ArrayList<Integer> aList = new ArrayList<>();
        
        for(int k : set2)
        {
            if(set1.contains(k))
                aList.add(k);
        }
        for(int k : set1)
        {
            if(set2.contains(k) && !aList.contains(k))
                aList.add(k);
        }
        
        int[] arr = new int[aList.size()];
        
        for(int i =0; i<arr.length; i++ )
        {
            arr[i] = aList.get(i);
        }
        
        return arr;
    }
}