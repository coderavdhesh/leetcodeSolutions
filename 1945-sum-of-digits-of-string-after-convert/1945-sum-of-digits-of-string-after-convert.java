class Solution {
    public int getLucky(String s, int k) {
        
        String str = "";
        
        for(int i =0; i<s.length(); i++)
        {
            int n = (int) s.charAt(i) - 96;
            str += Integer.toString(n);
        }
        
        int num =0;
    
        while(k>0){
            long sum = 0;
            for(int i = 0; i< str.length(); i++)
                sum += Character.getNumericValue(str.charAt(i));
            k--;
            num = (int) sum;
            str = Long.toString(sum);
        }
        
        return num;
    }
}