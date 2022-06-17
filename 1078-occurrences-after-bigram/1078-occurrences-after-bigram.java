class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        
        String[] str = text.split("\\s+");
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<str.length-2 ; i++)
        {
            if(str[i].equals(first) && str[i+1].equals(second) )
                list.add(str[i+2]);
        }
        
        String[] arr = new String[list.size()];
        
        int k =0;
        for(String s : list)
            arr[k++] = s;
        
        return arr;
        
    }
}