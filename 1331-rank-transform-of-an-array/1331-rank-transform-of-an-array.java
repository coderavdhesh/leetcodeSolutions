class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        // the code is having O(nLogn) time
        
        int[] ary = new int[arr.length];
        int j =0;
        
        for(int ele : arr)
            ary[j++] = ele;
        
        Arrays.sort(ary);
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int rank =1;
        for(int i : ary)
            map.put(i, map.get(i) == null ? rank++ : map.get(i) );
        
        for(int r=0; r<arr.length; r++)
            arr[r] = map.get(arr[r]);
        
        return arr;
    }
}