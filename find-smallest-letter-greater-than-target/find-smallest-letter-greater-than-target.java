class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        
        // binary search 
         int start = 0 ;
	     int end = letters.length - 1;
	        
	     while (start <= end) {
	        int mid_idx = start + (end - start) / 2;
	        	
	        if(target >= letters[mid_idx]) {
	        	start = mid_idx + 1;
	        } else {
	        	end = mid_idx - 1;
	        }
	    }
	    //wrap around condition met (when s>e)
	    return letters[start % letters.length];// only this is improtant
        
    }
}