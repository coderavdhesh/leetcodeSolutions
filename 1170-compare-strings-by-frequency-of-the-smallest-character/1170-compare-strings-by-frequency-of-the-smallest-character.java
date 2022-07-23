class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        
        int[] wordsfreq = new int[words.length];
        
        int i= 0;
        for(String str : words)
            wordsfreq[i++] = stringFreq(str);
        
        int[] queriesfreq = new int[queries.length];
        
        int j= 0;
        for(String str : queries)
            queriesfreq[j++] = stringFreq(str);
        
        //now search in wordsfreq array :
        Arrays.sort(wordsfreq);
        
        for(int k =0; k<queriesfreq.length; k++ )
        {
            int freq = queriesfreq[k];
            queriesfreq[k] = moreFrequentWords(wordsfreq,0,wordsfreq.length-1,freq);
            System.out.println(queriesfreq[k]);
        }
        return queriesfreq ;
    }
    
    public int moreFrequentWords(int [] arr, int start, int end, int target)
    {
        if(target< arr[0])
            return arr.length;
        if(target > arr[arr.length-1])
            return 0;
        
        while(start<=end)
        {
            int mid = start + (end -start)/2;
            
            // if(arr[mid] == target)
            //     start = mid+1;
            if (arr[mid] <= target)
                start = mid +1;
            else 
                end = mid-1;
        }
        return arr.length - start ;
    }
    
    public int stringFreq(String s){//this block have nlogn
        
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        
        char c = arr[0];
        int count =0 ;
        
        for(int i =0; i< arr.length; i++)
            if(arr[i] == c)
                count++;
        
        return count;
    }
}