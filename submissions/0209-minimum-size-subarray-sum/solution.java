class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int min = Integer.MAX_VALUE;
        int s = 0;
        while(r < nums.length){
            s = s + nums[r];
            while(s >= target){
                min = Math.min(min, r - l+1);
                s = s - nums[l];
                l++;
            }
            
            
            r++;


        }
        if (min == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return min;
        }
    }
}
