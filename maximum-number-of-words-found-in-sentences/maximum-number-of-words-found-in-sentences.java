class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max = 0;
        for(int i =0; i<sentences.length; i++)
        {
            int count =1;
            int sentlen = sentences[i].length()-1;
            while(sentlen>=0)
            {
                if(sentences[i].charAt(sentlen) == ' ')
                    count++;
                
                sentlen--;
            }
            if(count>max)
                max = count;
        }
        return max;
    }
}