class Solution {
    public String reverseVowels(String s) {
        
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
        return String.valueOf(arr);
    }
}