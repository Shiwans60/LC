class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n = nums.length ;
        int j = n- 1;
        long sum = 0;
        for(int i = 0; i < k; i++){
            int val = nums[j - i];
            
            if(mul >1){
                sum += (long)mul*val;
                mul--;
            }
            else{
                sum += val;
            }
            
        }
        return sum;
    }
}
