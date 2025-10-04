class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans = forgoal(nums, k) - forgoal(nums, k-1);
        return ans;
        
    }
    public int forgoal(int[] nums, int k){
        if(k < 0){
            return 0;
        }
        int l = 0;
        int r =0;
        int count = 0;
        int sum = 0;
        while(r < nums.length){
            sum = sum + nums[r]%2;
            while(sum > k){
                sum = sum - nums[l]%2;
                l++;
            }
            if( sum <= k){
                count = count + (r-l+1);

            }
            
            r++;
        }
        return count;
    }
}
