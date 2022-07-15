class Solution {
    public int halveArray(int[] nums) {
        
        int minOperations = 0;
        
        PriorityQueue<Double> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        
        double arrSum = 0;
        for(int n : nums)
        {
            arrSum += (double) n;
            maxheap.offer((double)n);
        }
        
        double halve = arrSum/2;
        
        while(arrSum > halve)
        {
            double num = maxheap.poll();
            arrSum -= (num/2);
            maxheap.offer(num/2);
            
            minOperations++;
        }
        
        return minOperations;
        

    }
}