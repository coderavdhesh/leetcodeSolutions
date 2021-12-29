class Solution {
    public int diagonalSum(int[][] mat) {
        
//         int n = mat.length-1 ;
//         int sum =0;
        
//         for(int i=0;i<mat.length; i++)
//         {
//             n = (n-i)>0 ? n-i : i-n;
//             sum += mat[i][i] + mat[i][n];
//         }
    
//         if(mat.length %2 == 1)
//             sum = sum - mat[n/2][n/2];

//         return sum;
        
        
        int sum = 0;
        int n = mat.length-1;
        for(int i =0;i<mat.length;i++)
        {
            if(i == n)
            {
                sum += mat[i][n--];
                continue;
            }
            sum += mat[i][i];
            sum += mat[i][n--];
        }
        return sum;
    }
}