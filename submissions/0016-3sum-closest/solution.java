class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closesum = nums[0] + nums[1] + nums[nums.length -1];
        for(int i = 0; i < nums.length -2; i++){
            int l = i+1;
            int r = nums.length - 1;
            int mind = Math.abs(closesum - target);
            while(l<r){
                int sum = nums[i] + nums[l] + nums[r];
                
                if(Math.abs(sum - target) < mind){
                    closesum = sum;
                    mind = Math.abs(sum - target);
                }
                if(sum < target){
                    l++;
                }
                else if( sum > target){
                    r--;
                }
                else {
                    return sum;
                }
            }

        }
        return closesum;
        
    }
}
