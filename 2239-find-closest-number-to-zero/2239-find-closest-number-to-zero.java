class Solution {
    public int findClosestNumber(int[] nums) {
        
//         int arr[] = new int[2];
        
//         arr[0] = nums[0];// the value
//         arr[1] = Math.abs(nums[0] - 0); // min
        
//         for(int i=1; i<nums.length; i++)
//         {
//             int min = Math.abs(nums[i] - 0);
//             if( min < arr[1])
//             {
//                 arr[0] = nums[i];
//                 arr[1] = min;
//             }
//             if( min == arr[1] )
//             {
//                 if(arr[0] < nums[i])
//                 {
//                     arr[0] = nums[i];
//                     arr[1] = min;
//                 }
//             }
//         }
        
//         return arr[0];
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                if(Math.abs(a)==Math.abs(b)) return b-a;
                return Integer.compare(Math.abs(a),Math.abs(b));
            }
        });
        for(int i:nums) heap.add(i);
        return heap.remove();
        
    }
}