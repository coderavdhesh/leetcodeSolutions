class Solution {
    public List<String> cellsInRange(String s) {
        
        List<String> strList = new ArrayList<>();
        
        char c1 = s.charAt(0);
        char c2 = s.charAt(3);
        
        char a = s.charAt(1);
        char b = s.charAt(4);
        
        for(char i = c1; i<=c2; i++)
        {
            for(char j =a; j<=b; j++)
            {
                // this line is imp
                strList.add(new String(new char[]{i, j}));
                // String str = Character.toString(i) + Character.toString(j);
                // strList.add(str);
            }
        }
        
        return strList;
        
    }
}