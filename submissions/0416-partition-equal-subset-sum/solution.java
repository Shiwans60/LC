class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        if(sum%2 != 0) return false;
        int target = sum / 2;
        Boolean dp[][] = new Boolean[nums.length][target+1];
        return solve(nums , 0, target, 0, dp);
        
    }
    private boolean solve(int[] nums , int i ,int t , int tot, Boolean[][] dp){
        if(tot == t) return true;
        if(i >= nums.length || tot > t) return false;
        if(dp[i][tot] != null){
            return dp[i][tot];
        }
        boolean take = solve(nums , i + 1 , t , tot + nums[i], dp);
        boolean notake = solve(nums , i+ 1, t , tot, dp);
        dp[i][tot] = take || notake;
        return dp[i][tot];
        
    }
}

