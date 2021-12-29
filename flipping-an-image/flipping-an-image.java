class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        
        int [][] B = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
        {
            int len = A[i].length;
            for (int j = 0; j < len; j++)
            {
                B[i][j] = A[i][len - 1 - j] == 0 ? 1 : 0;
            }
        }
        return B;
    }
}