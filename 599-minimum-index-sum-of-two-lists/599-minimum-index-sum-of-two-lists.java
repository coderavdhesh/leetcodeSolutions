class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        // copy kara hua code bhi dekh hi lete hain try kar ke
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> ansMap = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<list1.length; i++) {
            map1.put(list1[i], i);
        }
        
         for(int i=0; i<list2.length; i++) {
            map2.put(list2[i], i);
        }
        int mIndex = Integer.MAX_VALUE;
        for(String a: map1.keySet()) {
            if(map2.containsKey(a) == true) {
                if((map1.get(a) + map2.get(a)) <= mIndex) {
                    mIndex = map1.get(a) + map2.get(a);
                    ansMap.put(a, mIndex);
                }
            }
        }
        
        for(String a: ansMap.keySet()) {
            if(ansMap.get(a) == mIndex) {
                ans.add(a);
            }
        }
        String[] ansA = new String[ans.size()];
        for(int i=0; i<ansA.length; i++) {
            ansA[i] = ans.get(i);
        }
        return ansA;
        
    }
}