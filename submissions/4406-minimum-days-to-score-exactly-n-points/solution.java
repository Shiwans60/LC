class Solution {
    public int minDays(int n) {
        if(n == 0){
            return 0;
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp , Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0 ; i <= n ; i++){
            for(int j = 1;(long) j*(j+1)/2 <= i; j++){
                int p = (j* (j + 1)/2);
                if(dp[i - p] != Integer.MAX_VALUE){
                    int d = dp[i - p] + j;
                    if(i - p > 0){
                        d++;
                    }
                    dp[i] = Math.min(dp[i] , d);
                }
            }
        }
        return dp[n];
        
    }
}
