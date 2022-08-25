class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int five = 0, ten = 0;
        
        for(int $ : bills)
        {
            if($ == 5)
                five++;
            if($ == 10){
                if(five==0)
                    return false;
                five--;
                ten++;
            }
            if($ == 20){
                if(ten>0 && five>0)
                {
                    ten--;
                    five--;
                }
                else if( ten == 0 && five>2)
                {
                    five -= 3;
                }
                else
                    return false;
            }
        }
        
        return true;
        
    }
}