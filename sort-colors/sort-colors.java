class Solution {
    public void sortColors(int[] a) {
        
     /*  the simple solution  ........... over all complaxity is O(n)
        int n = a.length;
        int zero = 0;     // intializing the integers as variables 
        int one = 0;
        int two = 0;
        for(int i=0;i<n; i++)  O(n)
        {
            if(a[i]==0) // now counting the frequncy of the integers 0,1,2
               zero++;
            if(a[i]==1)
               one++;
            else
               two++;
        }
        
        for(int i=0;i<n;i++)   // now updateing all integers with its frequency
        {
            if(i<zero)
               a[i]=0;
            if(i>=zero && i<one+zero)
               a[i]=1;
            if(i>=zero+one)   
               a[i]=2;
        
        }           */ 
        
        
        // #solution with two pointers
        
        if(a.length <=1)  // if the array is singleton or null
            return;
        
        int start =0;               // start pointer
        int end = a.length-1;       // end pointer    
        int i =0;                   // moving pointer
        
        while(i<=end){
            
            if(a[i]==2)   // if 2 found swap to right
            {
                swap(a,i,end);
                end--;
            }
            else if(a[i]==0)     // if 0 found swap to left
            {
                swap(a,i,start);
                start++;
                i++;
            }
            else  // remaing will update in the middle of the both 0 and 2
                i++;
            
        }
    }
    
    public void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}