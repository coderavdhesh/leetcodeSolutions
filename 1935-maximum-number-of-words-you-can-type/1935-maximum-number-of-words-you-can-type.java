class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        // this code i shaving O(n^2) time
//         String[] words = text.split("\\s+");
//         int count = words.length;
        
//         for(int i=0; i<words.length; i++)
//         {
//             String str = words[i];
//             for(int j =0; j<brokenLetters.length(); j++)
//            {
//                 if(str.indexOf(brokenLetters.charAt(j)) != -1)
//                 {
//                     count--;
//                     break;
//                 }
//             }
//         }
//         return count;
        
        // now we use Hashset
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i =0; i< brokenLetters.length(); i++)
        {
            set.add( brokenLetters.charAt(i)) ; 
        }
        
        boolean flag = false;
        int count =0 ;
        
        for(int i = 0; i< text.length() ; i++)
        {
            if(set.contains(text.charAt(i)) )
                flag = true;
        
            if(text.charAt(i) == ' ')
            {
                if(!flag)
                    count++;
                
                flag = false;
            }
        }
        
        if(!flag)// if last word is typable with key-board
            count++;
        
        return count;
        
    }
}