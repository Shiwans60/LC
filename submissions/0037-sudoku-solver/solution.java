class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
        
    }
    private Boolean solve(char[][] board){
        for(int i = 0 ; i < 9; i++){
            for(int j = 0 ; j < 9; j++){
                if(board[i][j] == '.'){
                    for(char d = '1'; d <= '9'; d++){
                        if(valid(board , i , j , d)){
                            board[i][j] = d;
                            if(solve(board) == true){
                                return true;
                            }
                            board[i][j] = '.';

                        }
                    }
                    return false;

                }
            }
        }
        return true;
    } 
    private Boolean valid(char[][] board, int r , int c , char d){
        for(int i = 0 ; i < 9; i++){
            if(board[i][c] == d ){
                return false;
            }
            if(board[r][i] == d){
                return false;
            }
        }
        int m = r/3 * 3;
        int n = c/3 * 3;
        for(int k = 0 ; k < 3; k++){
            for(int l = 0; l < 3; l++){
                if(board[m +k][n + l] == d){
                    return false;
                }
            }
        }
        return true;
    }
}
