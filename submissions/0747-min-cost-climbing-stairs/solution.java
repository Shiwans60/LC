class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp , -1);
        return Math.min(solve(cost , n - 1, dp), solve(cost , n - 2, dp));
        
    }
    private int solve(int[] cost , int idx, int[] dp){
        int min = 0;
        if(idx == 0){
            return cost[0];
        }
        if(idx == 1){
            return cost[1];
        }
        if(dp[idx] != -1){
            return dp[idx];
        }
        int prev1 = solve(cost , idx - 1, dp);
        int prev2 = solve(cost , idx - 2, dp);
        dp[idx] =  cost[idx] + Math.min(prev1 , prev2); 
        
        return dp[idx]; 

    }
}
