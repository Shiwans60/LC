class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int mlen = 0;
        int z = 0;
        while(r<nums.length){
            if(nums[r] == 0){
                z++;
            }
            while(z > 1){
                if(nums[l] == 0){
                    z--;
                }
                l++;
            }
            if(z <= 1){
                mlen = Math.max(mlen,r-l);

            }
            
            r++;
        }
        return mlen;
        
    }
}
