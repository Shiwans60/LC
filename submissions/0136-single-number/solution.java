class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int req = -1;
        if(nums.length == 1){
            return nums[0];
        }
        for( int i = 1; i < nums.length; i++){
            count++;
            if(i == nums.length - 1 && count == 1){
                req = nums[i];
            }
            if(count == 2 && nums[i] != nums[i-1]){
                req = nums[i-1];
                break;
            }
            if(count == 2 && nums[i] == nums[i-1]){
                count = 0;
            }
        
        }
        return req;
        
    }
}
