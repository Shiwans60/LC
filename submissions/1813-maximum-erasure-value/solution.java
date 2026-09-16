class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxs = 0;
        HashSet<Integer> s = new HashSet<>();
        while( r < n ){
            while(l < r && s.contains(nums[r])){
                s.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            s.add(nums[r]);
            sum += nums[r];
            
            maxs = Math.max(maxs, sum);
            r++;

        }
        return maxs;
        
    }
}
