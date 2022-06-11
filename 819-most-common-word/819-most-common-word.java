class Solution {
    public String mostCommonWord(String para, String[] banned) {
        
        para = para.toLowerCase();
        para = para.replaceAll("!", " ");
        para = para.replaceAll("\\?", " ");
        para = para.replaceAll("'", " ");
        para = para.replaceAll(",", " ");
        para = para.replaceAll(";", " ");
        para = para.replaceAll("\\.", " ");
        para = para.replaceAll("\"", " ");
        para = para.replaceAll("\\s+", " ");
        
        HashMap<String, Integer> map = new HashMap<>();
        
        String[] str = para.split(" ");
        
        for(String s : str)
            map.put(s, map.get(s)== null ? 1 : map.get(s) + 1);
        
        for(String s : banned)
            map.remove(s);
        
        int max = Integer.MIN_VALUE;
        for(int i : map.values() )
            max = Math.max(max, i);
        
        for(String s : map.keySet())
            if( map.get(s) == max )
                return s;
        
        return "";
        
    }
}