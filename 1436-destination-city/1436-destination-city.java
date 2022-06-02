class Solution {
    public String destCity(List<List<String>> paths) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i<paths.size(); i++)
        {
            for( int j=0; j<paths.get(i).size(); j++)
            {
                String str = paths.get(i).get(j);
                
                if(map.get(str) == null && j == 0)
                    map.put(str, 1);
                else if (map.get(str) == null && j >0)
                    map.put(str, 0);
                else if (map.get(str) != null && j == 0)
                    map.put(str, map.get(str)+ 1);
                else
                    map.put(str, map.get(str)+ 0);
                
            }
        }
        
        for(String s : map.keySet())
        {
            if(map.get(s) == 0)
                return s;
        }
        
        
        return "";
        
    }
}