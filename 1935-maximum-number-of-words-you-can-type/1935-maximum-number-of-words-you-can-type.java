class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        
        String[] words = text.split("\\s+");
        int count = words.length;
        
        for(int i=0; i<words.length; i++)
        {
            String str = words[i];
            for(int j =0; j<brokenLetters.length(); j++)
           {
                if(str.indexOf(brokenLetters.charAt(j)) != -1)
                {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}