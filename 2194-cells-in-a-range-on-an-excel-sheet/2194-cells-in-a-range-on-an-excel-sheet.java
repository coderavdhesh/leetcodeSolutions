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
                strList.add(new String(new char[]{i, j}));
            }
        }
        
        return strList;
        
        
//         List<String> l = new ArrayList<>();
//     int c1 = (int)s.charAt(0);
//     int c2 = (int)s.charAt(3);
//     int r1 = (int)s.charAt(1);
//     int r2 = (int)s.charAt(4);
	
//     for(int i=c1; i<=c2; i++){
//         char ch = (char)i;
//         for(int j=r1; j<=r2; j++){
//             char n = (char)j;
//             String s = Character.toString(ch) + Character.toString(n);
//             l.add(s);
//         }
//     }
//     return l;
        
        
        
//         char [] c=s.toCharArray();
//         List str= new ArrayList<>();
    
//         for(char i=c[0];i<=c[3];i++)
//         {
//             for(char j=c[1];j<=c[4];j++)
//                 str.add(new String(new char[]{i, j}));
//         }
//             return str;  
        
        
//     // char sc = s.charAt(0), ec = s.charAt(3);
//     // char sr = s.charAt(1), er = s.charAt(4);
//     // List res = new ArrayList<>();
    
//     // for (char i = sc; i <= ec; ++i){
//     // for (char j = sr; j <= er; ++j){
//     // res.add(new String(new char[]{i, j}));
//     // }
//     // }
    
//     // return res;
    }
}