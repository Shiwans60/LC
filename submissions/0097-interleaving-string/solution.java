class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        Boolean dp[][][] = new Boolean[s1.length() + 1][s2.length() + 1][s3.length() + 1];

        return solve(s1, s2, s3 , 0 , 0 ,0, dp);
    }
    private boolean solve(String s1, String s2, String s3, int i , int j, int k, Boolean dp[][][]){
        if(k == s3.length() && j == s2.length() && i == s1.length()){
            return true;
        }
        if( i < s1.length() && k < s3.length() && j < s2.length() && dp[i][j][k] != null){
            return dp[i][j][k];
        }
        if( i < s1.length() && k < s3.length() && s3.charAt(k) == s1.charAt(i) ){
            
            
            if(solve(s1 , s2 , s3 , i + 1 , j , k + 1, dp)){
                return dp[i][j][k] = true;
            }

        }
        if(j < s2.length() && k < s3.length() && s3.charAt(k) == s2.charAt(j)){
            
            if(solve(s1 , s2 , s3 , i , j +1 , k + 1, dp)){
                return dp[i][j][k] = true;
            }

        }
        return dp[i][j][k] = false;

    }
}
