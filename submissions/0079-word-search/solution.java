class Solution {
    private static final int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int k = 0;
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(board[i][j] == word.charAt(0)){
                    if(check(i , j , board , word, 0)){
                        return true;
                    }

                }
                
            }
        }
        return false;
        
    }
    private boolean check(int i , int j , char[][] board, String word , int idx){
        if(idx == word.length()) return true;
        int m = board.length;
        int n = board[0].length;
        if(i < 0 || j < 0 || i >= m || j >= n || board[i][j] == '0' || board[i][j] != word.charAt(idx)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '0';
        for(int k = 0 ; k < 4; k++){
            int i_ = i + dir[k][0];
            int j_ = j + dir[k][1];
            if(check(i_, j_, board, word, idx+1 )){
                board[i][j] = temp;
                return true;
            }
        }
        board[i][j] = temp;

        return false;

    }
}
