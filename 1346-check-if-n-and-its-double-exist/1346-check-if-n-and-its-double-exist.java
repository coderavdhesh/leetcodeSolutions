class Solution {
    public boolean checkIfExist(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : arr)
        {
            if(set.contains(i*2) || (i%2 == 0 && set.contains(i/2)))
                return true;
            else
                set.add(i);
        }
        return false;
        
    }
}


























//         HashSet<Integer> set = new HashSet<>();
        
//         for(int i : arr)
//             set.add(i);
        
//         for(int i : arr)
//         {
//             if(set.contains(2*i) || (i%2 == 0 && set.contains(i/2)))
//                 return true;
//         }
        
//         return false;