class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n < 3) return 0;
        return solve(nums , 2 ,nums[1] - nums[0], 0);
        
    }
    private int solve(int[] nums , int i , int d, int curr){
        if(i >= nums.length){
            return 0;
        }
        if(nums[i] - nums[i - 1] == d){
            curr++;
            return curr + solve(nums , i +1, d, curr);
        }
        
        return solve(nums , i + 1, nums[i] - nums[i - 1], 0);

    }
}
