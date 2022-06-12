class Solution {
    public List<String> removeAnagrams(String[] words) {
        
        ArrayList<String> arr = new ArrayList<>();
        
        int i =0;
        int j =i+1;
        
        for(String str : words)
            arr.add(str);
        
        while(j< words.length)
        {   
            if( anagram(words[i], words[j]) )
            {
                arr.remove(words[j]);
                j++;
            }
            else
            {
                i=j;
                j=i+1;
            }
        }
        
        return arr;
        
    }
    
    public boolean anagram(String str1, String str2)
    {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(arr1.length != arr2.length)
            return false;
        
        for(int i=0; i<arr1.length; i++)
        {
            if(arr1[i] != arr2[i])
                return false;
        }
        
        return true;
    }
}