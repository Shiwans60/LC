class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int dp[][][] = new int[2][101][101];
        for(int p = 0 ; p < 2 ; p++){
            for(int i = 0 ; i < 101; i++){
                Arrays.fill(dp[p][i] , -1);
            }
        }


        return solve(piles , 0 , 1, 1, dp);
        
        
    }
    private int solve(int[] piles , int i   , int m , int p, int[][][] dp){
        if(i == piles.length){
            return 0;
        }
        if(dp[p][i][m] != -1){
            return dp[p][i][m];
        }
        int ans;
        if(p == 1){
            ans = -1;
        }
        else{
            ans = Integer.MAX_VALUE;
        }
        int sum = 0;


        for(int x = 1 ; x <= 2* m && i+x <= piles.length; x++){
            sum += piles[i + x - 1];
            if(p ==1){
                ans = Math.max(ans , sum + solve(piles , i + x, Math.max(m , x) , 0, dp));
            }
            else{
                ans = Math.min(ans , solve(piles , i+x, Math.max(m , x), 1, dp));
            }
            
        }
        return dp[p][i][m] = ans;
    }
}
