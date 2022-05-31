class Solution {
    public int numRookCaptures(char[][] board) {
        
        int count =0 ;
        
        // first find the position of the Rock
        int x =-1, y =-1;
        for(int i =0; i<8; i++)
        {
            for(int j = 0; j< 8; j++)
            {
                if(board[i][j] == 'R')
                {
                    x=i;
                    y=j;
                    break;
                }
            }
        }
        
        System.out.println(x+" " +y);
        
        // for traverse left
        for(int j = y-1; j>=0 ; j--)
        {
            if(board[x][j] == 'B')
                break;
            if (board[x][j] == 'p')
            {
                count++;
                break;
            }
        }
        
        // for traverse right
        for(int j = y +1; j<8 ; j++)
        {
            if(board[x][j] == 'B')
                break;
            if (board[x][j] == 'p')
            {
                count++;
                break;
            }
        }
        
        // for traverse up
        for(int j = x-1; j>=0 ; j--)
        {
            if(board[j][y] == 'B')
                break;
            if (board[j][y] == 'p')
            {
                count++;
                break;
            }
        }
        
        // for traverse down
        for(int j = x+1; j<8 ; j++)
        {
            if(board[j][y] == 'B')
                break;
            if (board[j][y] == 'p')
            {
                count++;
                break;
            }
        }
        
        return count;
        
    }
}