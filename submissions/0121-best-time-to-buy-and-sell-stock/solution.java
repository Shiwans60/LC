class Solution {
    public int maxProfit(int[] nums) {
        int mini = nums[0];
        int profit = 0;
        for (int i = 0; i < nums.length; i++){
            int diff = nums[i] - mini;
            profit = Math.max(profit, diff);
            mini = Math.min(mini, nums[i]);

        }
        return profit;
            
    }
}
