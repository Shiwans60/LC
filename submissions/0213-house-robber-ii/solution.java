class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int[] dp = new int[101];
        int[] dp2 = new int[101];
        Arrays.fill(dp , -1);
        Arrays.fill(dp2 , -1);
        int f = solve(nums , 0 , n - 2, dp);
        int s = solve(nums , 1 ,n - 1 , dp2);
        return Math.max(f,s);
        
    }
    private int solve(int[] nums , int i ,int end, int[] dp){
        if(i > end) return 0;
        if(dp[i] != -1){
            return dp[i];
        }
        int steal = nums[i] + solve(nums , i+2,end, dp);
        int skip = solve(nums , i +1 ,end , dp);
        dp[i] = Math.max(steal , skip);
        return dp[i];

    }
}
