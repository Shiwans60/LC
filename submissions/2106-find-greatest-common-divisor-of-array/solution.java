class Solution {
    public int findGCD(int[] nums) {
        int maxn = Integer.MIN_VALUE;
        int minn = Integer.MAX_VALUE;
        int n = nums.length;
        int req = 1;
        for(int i = 0; i < n; i++){
            maxn = Math.max(maxn, nums[i]);
        }
        for(int i = 0; i < n; i++){
            minn = Math.min(minn, nums[i]);
        }
        for(int i = 1; i <= minn; i++){
            if(maxn % i == 0 && minn % i == 0){
                req = Math.max(req, i);
            }
        }
        return req;

        
    }
}
