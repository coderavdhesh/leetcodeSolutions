class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        
        int min = Integer.MAX_VALUE ;
        for(int i =0; i<arr.length-1; i++)
        {
            min = Math.min(min,arr[i+1]-arr[i]);
        }
        
        List<List<Integer>> ansList = new ArrayList<List<Integer>>();
        
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i+1]-arr[i] == min)
            {
                ansList.add(Arrays.asList(arr[i],arr[i+1]));// important line
            } 
        }
        
        return ansList;
        
    }
}