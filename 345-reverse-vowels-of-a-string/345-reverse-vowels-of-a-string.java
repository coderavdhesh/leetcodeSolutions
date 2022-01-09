class Solution {
    /*public String reverseVowels(String s) {
        // Method one : using set to store vowels
        char arr[]=s.toCharArray();
        Set<Character>vowel=Set.of('a','e','i','o','u','A','E','I','O','U');// important--- set of the vowels 
        int l=0,r=s.length()-1;
        while(l<r){
          if(vowel.contains(arr[l])&&vowel.contains(arr[r])){
              char t=arr[l];
              arr[l++]=arr[r];
              arr[r--]=t;
          }
          else if(!vowel.contains(arr[l])&&!vowel.contains(arr[r])){
              l++;
              r--;
          }
          else if(!vowel.contains(arr[l])&&vowel.contains(arr[r])) 
              l++;
          else 
              r--;
        }
        return String.valueOf(arr);  .
    }*/
    
    public static boolean IsVowel(char ch){
        String vowels = "aeiouAEIOU";
        int idx = vowels.indexOf(ch);
        
        if(idx == -1){
            return false;
        }
        else{
            return true;
        }
    }
    
    // method 2 : creat a str of vowels and checking the char belongs to it or not---
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        char[] arr = s.toCharArray();
        
        while(i < j){
            while(i < j && IsVowel(arr[i]) == false){
                i++;
            }
            while(i < j && IsVowel(arr[j]) == false){
                j--;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}