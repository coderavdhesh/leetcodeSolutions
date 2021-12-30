class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m = mat[0].length;
        
        if(n*m != r*c)
        {
            return mat;
        }
        
        int a =0;
        int b =0;
        int[][] reshape = new int[r][c];
        for(int i =0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                reshape[i][j] = mat[a][b];
                b++;
                if(b>m-1)
                {
                    a++;
                    b=0;
                }
            }
        }
        return reshape;
    }
}