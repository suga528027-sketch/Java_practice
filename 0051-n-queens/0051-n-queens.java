class Solution {
    List<List<String>> list = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        for(char i[] : board)
        {
            Arrays.fill(i , '.'); 
        }
        solve(0 , board);
        return list;
    }


    public void solve(int col , char [][] board)
    {
        // add result to the answer list
        if(col == board.length) { 
            List<String> temp = new ArrayList<>();
            for(char[] c : board)
            {
                StringBuilder sb = new StringBuilder();
                for(char ch:c)
                {
                    sb.append(ch);
                }
                temp.add(sb.toString());
            }
            list.add(new ArrayList<>(temp));
            return ;
        }
        for(int row = 0; row < board.length; row++)
        {
            if(isValid(row , col , board))
            {
                board[row][col] = 'Q';
                //recursion
                solve(col+1 , board);
                
                // backtracking removing the queen and placing dot again
                board[row][col] = '.';
            }
        }
    }


    public boolean isValid(int row , int col , char [][] board)
    {
        int r = row;
        int c = col;
        // uppper left diagonal
        while(r >= 0 && c >= 0)
        {
            if(board[r][c]=='Q') return false;
            r--;
            c--;
        }
        r = row;
        c = col;
        //left row
        while( c >= 0)
        {
            if(board[r][c]=='Q') return false;
            c--;
        }
        r = row;
        c = col;
        // lower left diagonal
        while(r < board.length && c >= 0)
        {
            if(board[r][c]=='Q') return false;
            r++;
            c--;
        } 
        // no need to check right because no queens placed in right yet and particular coloumn
        return true;
    }
}