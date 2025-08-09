class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0 ; i < nums.length -2 ;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicate nums[i]
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r){
                int sum = nums[l] + nums[r]  + nums[i];
                if ( sum == 0){
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l < r && nums[l] == nums[l +1]){
                        l++;
                    }
                    while(l<r && nums[r-1] == nums[r]){
                        r--;
                    }
                    l++;// ssince once the sum is zero for same i and r we cant get sum 0 by change in l only to resist the change r also need to b decreased.
                    r--;
                }
                else if (sum < 0){
                    l++;
                }
                else{
                    r--;
                }
            } 
        }
        return result;

    }
}
