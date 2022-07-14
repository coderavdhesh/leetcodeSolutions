class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count = 0;
        int i =0;
        for(int j = 0 ; j <= stones.length()-1; j++)
        {
            if(jewels.indexOf(stones.charAt(j)) != -1)
                count++;
        }
        
        return count;
        
    }
}