class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[][] dp = new int[nums.length][target + 1];
        for(int i = 0 ; i < nums.length; i++){
            Arrays.fill(dp[i] , -1);
        }

        return solve(nums , 0, target, dp);
    }
    private int solve(int[] nums , int i, int target, int[][] dp){
        if(target == 0){
            return 1;
        }
        if(i >= nums.length  || target < 0){
            return 0;
        }
        if(dp[i][target] != -1){
            return dp[i][target];
        }


        int take = solve(nums , 0 , target - nums[i] , dp);
        int not = solve(nums , i + 1, target, dp);
        return dp[i][target] = take + not;

    }
}
