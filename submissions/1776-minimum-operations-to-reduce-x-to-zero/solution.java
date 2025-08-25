class Solution {
    public int minOperations(int[] nums, int x) {
        int l = 0;
        int r = 0;
        int sum =0;
        int maxc = -1;
        int s =0;
        for (int i = 0; i < nums.length;i++){
            s = s + nums[i];
        }
        if(s-x < 0){
            return -1;
        }

        while(r<nums.length){
            sum = sum + nums[r];
            while(sum > s-x){
                sum = sum - nums[l];
                l++;
            }
            if (sum == s - x){
                maxc = Math.max(maxc,r - l + 1);
            }
            
            r++;
        }
        if ( maxc == -1){
            return -1;
        }
        else{
            return nums.length - maxc;
        }
    }
}
