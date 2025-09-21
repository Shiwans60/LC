class Solution {
    public boolean check(int[] nums) {
        if ( nums[0] < nums[nums.length-1]){
            for ( int i = 1; i < nums.length; i++){
                if (nums[i] < nums[i - 1]){
                    return false;
                }
            }
        }
        
        if (nums[0] >= nums[nums.length -1]){
            int break1 = 0;
            for ( int i = 1; i < nums.length; i++){
                if ( nums[i-1] > nums[i]){
                    break1++;
                    if (break1 > 1){
                        return false;
                    }
                    
                }
                
            }
            return true;
        }
        return true;
    }
}
