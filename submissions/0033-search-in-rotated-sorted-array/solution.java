class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        if (nums[0] <= nums[nums.length - 1]){
            return recc2(nums,low,high, target);
        }
        if ( nums.length <= 2){
            if (target == nums[1]){
                return 1;
            }
            if (target == nums[0]){
                return 0;
            }
            return -1;

        }
        return recc(nums,low,high ,target);
       
    }
    public int recc(int nums[], int low, int high , int target){
        if ( low > high ){
            return -1;
        }
        int mid = low + (high - low )/2;
        if (nums[mid] == target ){
            return mid;
        }
        if (target>= nums[mid] && nums[mid] >= nums[nums.length-1]){
            return recc(nums,mid+1,high,target);
        }
        
        if(target <= nums[mid] && nums[mid] >= nums[nums.length-1] && target > nums[nums.length - 1]){
            return recc(nums,low,mid-1,target);
        }
        if ( target <= nums[mid] && nums[mid] >= nums[nums.length-1] && target <= nums[nums.length - 1]){
            return recc(nums,mid+1,high,target);
        }
        if (target <= nums[mid] && nums[mid] <= nums[nums.length-1]){
            return recc(nums,low,mid-1,target);
        }
        if ( target >= nums[mid] && nums[mid] <= nums[nums.length - 1] && target <= nums[nums.length - 1]){
            return recc(nums,mid+1,high,target);
        }
        //if (target > nums[mid] && nums[mid] < nums[nums.length - 1] && target > nums[nums.length - 1]){
        return recc(nums,low,mid-1,target);
        //}
        

    }
    public int recc2(int nums[], int low, int high , int target){
       if (low > high ){
            return -1;
        } 
        int mid = low + (high - low )/2;
        if(target == nums[mid]){
            return mid;
        }
        if( target < nums[mid]){
            return recc2(nums,low, mid-1, target);
        }
        return recc2(nums,mid+1,high,target); 
    }

}
