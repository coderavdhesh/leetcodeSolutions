class Solution {
    public boolean checkZeroOnes(String s) {
        int count0 =0, count1 =0, max0 = 0, max1 = 0;
        
        for(int i =0; i< s.length(); i++)
        {
            if(s.charAt(i) == '0')
            {
                count0++;
                max0 = Math.max(max0, count0);
                 
                count1 =0;// if it finds the zero in string.. then it will 0 the counts of 1
            }
            else 
            {
                count1++;
                max1 = Math.max(max1, count1);
                
                count0 =0;// if it finds the one in string.. then it will 0 the counts of 0
            }
        }
        
        // System.out.println(max0);
        // System.out.println(max1);
        
        return (max1>max0);
        
    }
}