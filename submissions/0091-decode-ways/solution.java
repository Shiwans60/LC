class Solution {
    
    public int numDecodings(String s) {
        int dp[] = new int[101];
        Arrays.fill(dp , -1);
        return solve(0 , s, dp);
    }
    private int solve(int i , String s, int[] dp){
        if( i == s.length() ){
            return 1;
        }
        if(s.charAt(i) == '0'){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int keep = solve(i + 1, s, dp);
        int pair = 0;
        if(i + 1< s.length()){
            if(s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) <= '6')){
                pair = solve(i + 2 , s, dp);
            }
        }
        dp[i] = keep + pair;
        return dp[i];
    }
}

