class Solution {
    public boolean checkValid(int[][] matrix) {
       
        HashMap<Integer, Integer> mapRow = new HashMap<>() ;
        HashMap<Integer, Integer> mapColumn = new HashMap<>() ;
        
        for (int i = 0; i < matrix.length; i++) {
            mapRow.clear() ;
            mapColumn.clear() ;
            
            for (int j = 0; j < matrix[i].length; j++) {
                if (mapRow.get(matrix[i][j]) == null) {
                    mapRow.put(matrix[i][j], 1) ;
                }
                else {
                    return false ;
                }
                
                if (mapColumn.get(matrix[j][i]) == null) {
                    mapColumn.put(matrix[j][i], 1) ;
                }
                else {
                    return false ;
                }
            }
        }
        
        return true ;
       
    }
}