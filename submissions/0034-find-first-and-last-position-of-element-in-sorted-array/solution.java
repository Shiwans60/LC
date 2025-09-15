class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        return recc(nums, low, high, target);      
    }
    public int[] recc(int nums[], int low , int high, int target){
        //int arr[] = new int[2];
        
        if (low > high){
            return new int[]{-1,-1};
        }
        int mid = low + (high - low)/2;
        if ( nums[mid] == target ){
            int mid1 = mid;
            int mid2 = mid;
            while ( mid1 > 0 && nums[mid1-1] == target  ){
                mid1--;
            }
            while ( mid2 < nums.length-1 && nums[mid2+1] == target ){
                mid2++;
            }

            return new int[]{mid1, mid2};
        }
        if ( nums[mid] > target){
            return recc(nums, low, mid -1, target);
        }
        return recc(nums, mid + 1, high, target);
    }
}
