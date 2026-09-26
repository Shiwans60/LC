class Solution {
    public int splitArray(int[] nums, int k) {
        int totsum = 0;
        for(int i = 0 ; i < nums.length ;i++){
            totsum += nums[i];
        }
        int[][] dp = new int[nums.length + 1][k+1];
        for(int i = 0 ; i < nums.length ;i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(nums , k , 0, totsum, dp );
    }
    private int solve(int[] nums , int k , int i, int totsum, int[][] dp ){
        if( k == 1){
            int sum = 0;
            for(int j = i ; j < nums.length; j++){
                sum += nums[j];
            }
            return sum;
        }
        if(dp[i][k] != -1){
            return dp[i][k];
        }
        int mins = Integer.MAX_VALUE;
        int currsum = 0;
        for(int j = i ; j < nums.length; j++){
            currsum += nums[j];
            int maxs = Math.max(currsum , solve(nums , k - 1 , j+1 , totsum , dp));
            mins = Math.min(mins, maxs);
            if(currsum >= mins){
                break;
            }
        }
        
        return dp[i][k] = mins;
        
    }
}
