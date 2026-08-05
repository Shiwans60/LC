class Solution {
    public int longestConsecutive(int[] nums) {
        // TreeSet<Integer> t = new TreeSet<>();
        // int count = 0;
        // int maxi = 0;
        // for (int i = 0; i < nums.length; i++){
        //     t.add(nums[i]);
        //     if(i > 0 && nums[i] == t.contains(nums[i])){
        //         count++;
        //         maxi = Math.max(maxi, count);
        //     }
        //     else{
        //         count = 0;
        //     }
        // }
        // return maxi;
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int maxc = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1] + 1 ){
                count++;
                maxc = Math.max(maxc, count);
            }
            else if(nums[i] == nums[i -1]){
                continue;
            }
            else{
                count = 1;
            }    
        }
        return maxc;
    }
}
