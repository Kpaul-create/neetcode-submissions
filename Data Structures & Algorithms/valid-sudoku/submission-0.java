class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            int a=0,k=0;
            for(int j=0;j<9;j++){
                if (board[i][j] == '.') continue;
                for (int c = 0; c < 9; c++) {
                    if (c != j && board[i][c] == board[i][j]) return false; 
                    if (c != i && board[c][j] == board[i][j]) return false; 
                }
                int boxRow = (i / 3) * 3;
                int boxCol = (j / 3) * 3;
                for (int r = 0; r < 3; r++) {
                    for (int c = 0; c < 3; c++) {
                        int currR = boxRow + r;
                        int currC = boxCol + c;
                        if ((currR != i || currC != j) && board[currR][currC] == board[i][j]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}