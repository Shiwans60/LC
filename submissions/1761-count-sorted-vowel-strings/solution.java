class Solution {
    public int countVowelStrings(int n) {
        int[][] dp = new int[n +1][6];
        for(int i= 0 ; i <= n ; i++){
            Arrays.fill(dp[i],  -1);
        }
        return solve(n , 0 ,dp);
    
    }
    private int solve(int n , int i , int[][] dp){
        if(i >= 5){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n][i] != -1){
            return dp[n][i];
        }
        dp[n][i] = solve(n - 1, i, dp) + solve(n , i + 1, dp);
        return dp[n][i];
        
    }
}
