class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < nums.length ; i++){
            sum = sum + nums[i];
        }
        if(sum % k != 0) return false;
        int req = sum / k;
        boolean[] used = new boolean[nums.length]; 
        return solve(0 , k , 0, req , nums , used);        
    }
    private boolean solve(int i , int k , int subs, int req , int[] nums, boolean[] used){
        if(k == 1){
            return true;
        }
        if(subs == req){
           return solve(0 , k -1 , 0, req, nums, used);
        }
        for(int j = i ; j < nums.length ; j++){
            if(used[j] != false || subs + nums[j] > req){
                continue;
            }
            used[j] = true;
            if(solve(j + 1, k , subs + nums[j], req, nums, used)){
                return true;
            }
            used[j] = false;

        }
        return false;
    }
}
