class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        int indexSum =-1;
        HashMap<String, Integer> list = new HashMap<>();
        
        int check =0;
        
        for( int i =0 ; i< list1.length; i++)
        {
            for(int j =0; j< list2.length; j++)
            {
                if(list1[i].equals(list2[j]))
                {
                    list.put(list1[i], i+j);
                    check = i+j;
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        boolean flag = true;
        
        for(int n : list.values())
        {
            if(check != n)
                flag = false;
            
            min = Math.min(min, n);
        }
        
        if(!flag)
            for(String str : list.keySet())
                if(list.get(str) == min)
                    return new String[]{str};
        
        String[] arr = new String[list.size()];
        
        int n =0;
        for(String str : list.keySet())
            arr[n++] = str;
            
        return arr;
        
    }
}