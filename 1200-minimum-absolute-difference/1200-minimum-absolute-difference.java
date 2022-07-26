class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        
        List<List<Integer>> list = new ArrayList<>();
        int minAbs = Integer.MAX_VALUE;
        
        for(int i =0; i< arr.length-1; i++)
            minAbs = Math.min(minAbs, arr[i+1]- arr[i]);
        
        for(int i =0; i< arr.length; i++)
        {
            int target = arr[i]+minAbs;
            if(binarySearch(arr, i+1, arr.length-1, target) > Integer.MIN_VALUE)
                list.add(Arrays.asList(arr[i],target));
        }
        return list;
    }
    
    public int binarySearch(int arr[], int start, int end, int target){
        
        while(start<=end)
        {
            int mid = start+ (end -start)/2;
            
            if(arr[mid] == target)
                return target;
            else if( target > arr[mid])
                start = mid +1;
            else
                end = mid-1;
        }
        
        return Integer.MIN_VALUE ;
    }
}