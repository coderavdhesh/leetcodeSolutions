class Solution {
    public String[] findWords(String[] words) {
        
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";
        
        HashSet<Character> ch1 = new HashSet<>(), ch2 = new HashSet<>(), ch3 = new HashSet<>();
            
        for(int i= 0; i<row1.length(); i++)
            ch1.add(row1.charAt(i));
        for(int i=0; i<row2.length(); i++)
            ch2.add(row2.charAt(i));
        for(int i=0; i<row3.length(); i++)
            ch3.add(row3.charAt(i));
        
        ArrayList<String> list = new ArrayList<>();
        
        for(String str : words)
        {
            int count1 =0, count2=0, count3=0;
            for(int i =0 ; i< str.length(); i++)
            {
                if(ch1.contains(str.charAt(i))) count1++;
                if(ch2.contains(str.charAt(i))) count2++;
                if(ch3.contains(str.charAt(i))) count3++;
            }
            
            if(count1==str.length() || count2==str.length() || count3==str.length())
                list.add(str);
        }
        
        String[] arr = new String[list.size()];
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = list.get(i);
        }
            
        return arr;
        
    }
}