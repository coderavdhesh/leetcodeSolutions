class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry =0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = digits.length-1; i>=0; i--)
        {
            int num = digits[i] + carry + ( (i == digits.length-1 ) ? 1 : 0 );
            
            if(num > 9)
            {
                if( i == 0 && num-9 > 0)
                {
                    list.add(0);
                    list.add(num-9);
                }
                else
                {
                    list.add(0);
                    carry = num - 9;
                }
            }
            else
            {
                list.add(num);
                carry = 0;
            }  
        }
        
        Collections.reverse(list);
        
        int[] arr = new int[list.size()];
        
        for(int j = 0; j< list.size(); j++ )
            arr[j] = list.get(j);
        
        return arr;
    }
}