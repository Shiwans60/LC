class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = forgoal(nums, goal) - forgoal(nums, goal - 1);
        return ans;
        
        
    }
    public int forgoal(int[] nums, int goal){
        if(goal < 0){
            return 0;
        }
        int l = 0;
        int r = 0;
        int sum = 0;
        int count = 0;
        while(r < nums.length){
            sum = sum + nums[r];
            while(sum > goal){
                sum = sum - nums[l];
                l++;
            }
            count = count + (r - l + 1);
            r++;

        }
        return count;
    }
}
