class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        return recc(nums, low, high, target);   
    }
    public int recc(int nums[], int low , int high , int target){
        if (low > high){
            return low;
        }
        int mid = low + (high - low )/2;
        if ( nums[mid] == target ){
            return mid;
        }
        if ( nums[mid] > target){
            return recc(nums, low, mid - 1, target);
        }
        return recc( nums, mid + 1, high, target);
    }
}
