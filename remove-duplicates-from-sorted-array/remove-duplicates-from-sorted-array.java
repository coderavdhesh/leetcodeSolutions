class Solution {
    public int removeDuplicates(int[] nums) {
     
        TreeSet<Integer> ans = new TreeSet<>();
        
        for(int i : nums){
            ans.add(i);
        }
        
        int j=0; 
        for(int element : ans)
        {
            nums[j] = element;j++;
        }
        
        return ans.size();
//         int i = 0;
        
//         for(int elements : nums){
//             if(i == 0 || elements > nums[i - 1]){
//                 nums[i] = elements;
//                 i++;
//             }
//         }
//         return i;
        
    }
    
}