class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int size = n*m ;

        int[][] res = new int[n][m];
        //prefix
        int prefix = 1;
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m ; j++){
                res[i][j] = prefix;
                prefix = (prefix* (grid[i][j] % 12345) ) % 12345;
                
            }
        }
        int suf = 1;
        for(int i = n- 1; i >= 0;i--){
            for(int j = m-1; j >= 0  ; j--){
                res[i][j] = (res[i][j] * suf) % 12345;
                suf = (suf*(grid[i][j] % 12345)) % 12345;
                
            }
        }
        return res;
    }
}
