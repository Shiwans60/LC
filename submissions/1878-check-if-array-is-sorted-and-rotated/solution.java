class Solution {
    public boolean check(int[] nums) {
        int breakk = 0;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] < nums[i - 1]){
                breakk++;
            }
        }
        if(nums[nums.length - 1] > nums[0] && breakk == 0){
            return true;
        }
        if(nums[nums.length - 1] < nums[0] && breakk == 1 ){
            return true;
        }
        if(nums[nums.length - 1] == nums[0] && (breakk == 1 || breakk == 0)){
            return true;
        }
        return false;
        
    }
}
