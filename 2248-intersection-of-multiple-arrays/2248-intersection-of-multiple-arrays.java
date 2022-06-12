class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums[0])
            set.add(num);
        
        for(int i =1; i<nums.length; i++)
        {
            
            HashSet<Integer> ans_set = new HashSet<>();
            
            for(int j =0; j<nums[i].length; j++)
            {
                if( set.contains(nums[i][j]) )
                    ans_set.add(nums[i][j]);
            }
            set = ans_set;  
            
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : set)
            list.add(i);
        
        int[] arr = new int[list.size()];
        
        for(int i = 0; i< list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        
        Arrays.sort(arr);
        
        ArrayList<Integer> ans_list = new ArrayList<>();
        
        for(int i : arr)
            ans_list.add(i);
        
        return ans_list;
        
    }
}