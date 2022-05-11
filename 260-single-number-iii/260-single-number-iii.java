class Solution {
    public int[] singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums)
        {
            map.put(i, map.get(i)==null ? 1 : map.get(i)+1 );
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : nums)
        {
            if(map.get(i) == 1)
                list.add(i);
        }
        
        int[] arr = new int[2];
        
        for(int i =0; i <list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        
        return arr;
        
    }
}