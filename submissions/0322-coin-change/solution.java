class Solution {
    int ans = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int dp[][] = new int[amount + 1][12];
        for(int[] row : dp){
            Arrays.fill(row , -1);
        }
        int ans = solve(coins , amount , 0, 0, dp);
        if( ans == Integer.MAX_VALUE) return -1;
        else{
            return ans;
        }
    }
    private int solve(int[] coins, int rem ,int i, int count, int[][] dp ){
        if(rem == 0){
            return 0;
        }
        
        if(i == coins.length){
            return Integer.MAX_VALUE;
        }
        if(dp[rem][i] != -1){
            return dp[rem][i];
        }
        int n = rem/coins[i];
        int ans = Integer.MAX_VALUE;
        for(int j = n ; j >= 0 ; j--){
            int next = solve(coins ,rem - (j * coins[i]) , i + 1, count + j, dp);
            if(next != Integer.MAX_VALUE){
                ans = Math.min(ans, next + j);
            }
            
        }
        dp[rem][i] = ans;
        return dp[rem][i];

    }
}
