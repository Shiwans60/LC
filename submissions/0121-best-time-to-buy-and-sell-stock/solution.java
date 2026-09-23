class Solution {
    public int maxProfit(int[] nums) {
        int mini = nums[0];
        int profit = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++){
            int diff = nums[i] - mini; 
            mini = Math.min(mini, nums[i]);
            
            profit = Math.max(diff, profit);
        }
        
        return profit;
            
    }
}
