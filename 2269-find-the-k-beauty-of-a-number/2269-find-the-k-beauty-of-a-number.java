class Solution {
    public int divisorSubstrings(int num, int k) {
        
        int count =0;
        String str = Integer.toString(num);
        
        for(int i=0; i<= str.length()-k; i++)
        {
            int temp = Integer.parseInt(str.substring(i,i+k));
            if(temp!= 0 && num % temp == 0)
                count++;
        }
        return count;
    }
}