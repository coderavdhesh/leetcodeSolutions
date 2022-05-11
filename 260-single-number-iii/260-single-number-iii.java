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
        
        arr[0] = list.get(0);
        arr[1] = list.get(1);
        
        return arr;
        
    }
}