class Solution {
    public boolean digitCount(String num) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i =0; i<num.length(); i++)
        {
            int nums = Integer.parseInt(String.valueOf(num.charAt(i)));
            map.put(nums, map.get(nums) == null ? 1 : map.get(nums) +1);
        }
        System.out.print(map);
        
        for(int i =0; i<num.length(); i++)
        {
            if(map.get(i) == null)
                map.put(i,0);
            
            if(map.get(i) != Integer.parseInt(String.valueOf(num.charAt(i))) )
                return false;
        }
        
        return true;
    }
}