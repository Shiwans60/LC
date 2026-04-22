class Solution {
    public int searchInsert(int[] nums, int target) {
        int r = nums.length -1;
        int l = 0;
        return solve(nums, l , r , target);
    }
    private int solve(int[] nums , int l , int r, int target){
        if(l > r){
            return l;
        }
        int mid = l + (r - l)/2;
        if(target == nums[mid]){
            return mid;
        }
        if(target > nums[mid]){
            return solve(nums, mid+1, r, target);
        }
        else{
            return solve(nums, l , mid -1 , target);
        }

    }
}
