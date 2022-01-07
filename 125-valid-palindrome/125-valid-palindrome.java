class Solution {
    
//     o(n) time o(1) space  \U0001f60e\U0001f609
    
     public boolean isPalindrome(String s) {
         
        s=replaceAll(s);// replacing all non-alphanumeric characters
         
        int i = 0;
        int j = s.length()-1;
        
        while(i<=j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true; 
    }
    
    public String replaceAll(String s){// only this is important 
        return s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    }
    
    
}