class Solution {
    
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        int[][] dp = new int[301][11];
        for(int i = 0 ; i <= 300 ; i++){
            Arrays.fill(dp[i] , -1);
        }
        if(n < d) return - 1;

        return solve(jobDifficulty, d , 0, dp);
    }
    private int solve(int[] jd, int d, int idx, int[][] dp){
        int n = jd.length;
        int maxd = 0;
        if(d == 1){
            for(int i = idx ; i < n; i++){
                maxd = Math.max(maxd, jd[i]);
            }
            return maxd;
        }
        if(dp[idx][d] != -1){
            return dp[idx][d];
        }
        int res = Integer.MAX_VALUE;
        for(int i = idx; i <= n - d; i++){
            maxd = Math.max(maxd , jd[i]);
            int diff = maxd + solve(jd , d - 1, i + 1, dp);
            res = Math.min(res , diff);
        }
        dp[idx][d] = res;
        return res;
    }
}
