class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1 ;
        return recc(nums, high, low , target);
        
    }
    public int recc( int nums[] ,int high ,int low,int target ){
        if(low > high){
            return -1;
        }
        int mid = low + (high - low)/2;
        if ( nums[mid] == target){
            return mid;
        }
        if (target > nums[mid] ){
            return recc(nums, high, mid + 1,target);
        }
        return recc(nums, mid-1, low, target);
        
    }
}
