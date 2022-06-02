class Solution {
    public boolean halvesAreAlike(String s) {
        
        ArrayList<Character> list = new ArrayList<Character>();
        list.add('a');list.add('e'); list.add('i');list.add('o'); list.add('u'); list.add('A'); list.add('E'); list.add('I'); list.add('O'); list.add('U');
        
        int count1 =0;
        int count2 =0;
        
        for(int i =0; i<s.length()/2; i++)
        {
            if(list.contains(s.charAt(i)) )
                count1++;
        }
            
        
        for(int i = s.length()/2; i<s.length(); i++)
        {
            if(list.contains(s.charAt(i)) )
                count2++;
        }
        
        return count1 == count2 ;
    }
}