class Solution {
    public boolean checkIfExist(int[] arr) {
        
        // this **brute-force** approch having O(n2) time
        /*for(int i =0; i<arr.length-1; i++)
        {
            for(int j =0; j<arr.length; j++)
            {
                if(i!=j && arr[i] == 2* arr[j])
                    return true;
            }
        }
        return false;*/
        
        // this code with **Binary Search** is having O(nlogn) compexity of code
        /*Arrays.sort(arr);
        
        for(int i =0; i<arr.length; i++)
        {
            int target = 2*arr[i];
            
            int left = 0;
            int right = arr.length-1;
            
            while(left<=right)
            {
                int mid = left + (right -left) /2;
                
                if(arr[mid] == target && mid != i)
                    return true;
                else if(target < arr[mid])
                    right = mid-1;
                else
                    left = mid +1;
                
            }
            
        }
        return false;*/
        
        // this **hashmap** solution is the most optimized with O(n) time
        
//         HashMap<Integer, Boolean> hashmap = new HashMap<>();
        
//         for(int num : arr) 
//         {
//             if(hashmap.containsKey(num * 2) || num % 2 == 0 && hashmap.containsKey(num / 2))
//                 return true;
//             else
//                 hashmap.put(num, true);
//         }
//         return false;
        
        // the solution with **HashSet** also haing O(n) solution 
        
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