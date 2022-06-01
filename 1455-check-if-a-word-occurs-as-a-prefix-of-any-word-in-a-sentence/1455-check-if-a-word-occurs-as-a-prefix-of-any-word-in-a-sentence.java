class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        // mers wala code 
//         String[] words = sentence.split("\\s");
        
//         int idx = searchWord.length();
        
//         for(int i =0; i<words.length; i++)
//         {
//             if(idx > words[i].length())
//                 continue;
//             if(words[i].substring(0,idx).equals(searchWord) )
//                 return i+1;
//         }
        
//         return -1;
        
        
        // we can also use the indexOf to search any substring into a string
        // batao zara yee 100% faster hain with same concept i have applied \U0001f602
        
        int index = -1;
        String[] words = sentence.split(" ");
        for(int i=0; i<words.length; i++){
            String word = words[i];
            if(word.indexOf(searchWord) == 0) // str.indexOf(substr)
            {
                return i+1;
            }
        }
        
        return index;
        
    }
}