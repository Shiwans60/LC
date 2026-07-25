class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n;i++){
            sum += nums[i];
        }
        int psum = 0;
        sum = sum - nums[0];
        if(sum == 0){
            return 0;
        }
        for(int i = 1; i < n ;i++){
            psum += nums[i-1];
            sum = sum - nums[i];
            if(sum == psum){
                return i;
            }
        }
        
        return -1;
    }
}
