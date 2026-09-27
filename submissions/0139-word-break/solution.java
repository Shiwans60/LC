class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean dp[] = new Boolean[s.length()];
        return solve(s , wordDict, 0, dp);
        
    }
    private boolean solve(String s ,List<String> l, int i, Boolean dp[]){
        if(i == s.length()){
            return true;
        }
        if(dp[i] != null){
            return dp[i];
        }
        for(int j = 0 ; j < l.size(); j++){
            if(i + l.get(j).length() <= s.length() && l.get(j).equals(s.substring(i,i+l.get(j).length()))){
                if(solve(s , l, i + l.get(j).length(), dp)){
                    return dp[i] = true;
                } 
                
            }
        }
        return dp[i] = false;

    }
}
