class Solution {
    public String capitalizeTitle(String title) {
        
        // title.toLowerCase();
        String[] words = title.split(" ");
        
        String answer = "";
        
        for(String word: words)
        {
            word = word.toLowerCase();
            if(word.length() < 3) 
            {
                answer += word;
            } 
            else 
            {
                answer += word.substring(0, 1).toUpperCase() + word.substring(1, word.length());
            }
            answer += " ";
        }
        return answer.trim();
        
//         char[] ch = title.toCharArray();
        
//         ch[0] -= 32;
        
//         for(int i= 1; i<ch.length; i++ )
//         {
//             if(ch[i-1] == ' ' && ch[i]>90)
//                 ch[i] -= 32;
//             else if(ch[i]>64 && ch[i] <91)
//                 ch[i] +=32;
//         }
        
//         return String.valueOf(ch);
        
    }
}