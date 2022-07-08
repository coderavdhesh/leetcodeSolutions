class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        ArrayList<String> list = new ArrayList<>();
        
        int i =1;
        int j =0;
        
        while(j<target.length)
        {
            list.add("Push");
            
            if( i != target[j] )
            {
                i++;
                list.add("Pop");
            }
            else
            {
                i++;
                j++;
            }
            
        }
        
        return list;
    }
}