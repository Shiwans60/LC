class Solution {
    int count = 0;
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n +1];
        for(int i = 0 ; i < m ; i++){
            Arrays.fill(dp[i] , -1);
        }
        return solve(0 , 0 , m , n, dp);
        
    }
    private int solve(int x , int y , int m , int n , int[][] dp){
        if(x == m - 1 && y == n -1){
            return 1;
        }
        if(dp[x][y] != -1){
            return dp[x][y];
        }
        int r = 0;
        int d = 0;
        if(y < n -1){
            r = solve(x , y+1, m , n, dp);

        }
        if(x < m - 1){
            d = solve(x + 1 , y , m , n, dp);
        }
     
        return dp[x][y] = r + d ;
    }
}
