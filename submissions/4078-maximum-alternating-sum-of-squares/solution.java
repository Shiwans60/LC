class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        for(int i = 0 , j = n -1; i < j; i++ , j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        long o = 0;
        long e = 0;
        for(int i = 0; i < n; i++) {
            long square = nums[i];

            if (i < (n + 1) / 2) {
                e += square;
            } else {
                o += square;
            }
        }
        return e - o;
       
    }
}
