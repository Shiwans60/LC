class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        return solve(nums, l , r, target);
        
    }
    private int solve(int[] nums, int l , int r, int target){
        if(l >
         r){
            return -1;
        }
        int mid = l + (r - l)/2;
        if(nums[mid] == target) return mid;
        if(target < nums[mid]){
            return solve(nums, l , mid -1 , target);
        }
        else{
            return solve(nums, mid + 1, r, target);
        }
        
    }
}
