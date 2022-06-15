class Solution {
    public int countVowelSubstrings(String word) {
        
//         String vowels = "aeiou";
        
//         HashSet<Character> set = new HashSet<>();
        
//         for(int i =0; i<word.length(); i++)
//         {
//             if( vowels.indexOf(word.charAt(i)) != -1)
//                 set.add(word.charAt(i));
//         }
        
         int vow = 0;
        int n = word.length();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < n-4; i++)
        {
            set.clear();
            for(int j = i; j < n; j++)
            {
                char ch = word.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    set.add(ch);
                    if(set.size() == 5)
                        vow++;
                }
                else
                    break;
            }
        }
        return vow;
        
        
        
    }
}