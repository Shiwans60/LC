class Solution {
    List<List<Integer>> l2 = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> l1 = new ArrayList<>();
        solve(candidates , target , 0, l1);
        return l2;
    }
    private void solve(int[] nums , int t , int i , List<Integer> l1){
        if (t == 0) {
            l2.add(new ArrayList<>(l1));
            l1 = new ArrayList<>();
            return;
        }

        if (i >= nums.length || t < 0) {
            return;
        }
        l1.add(nums[i]);
        solve(nums , t - nums[i], i+1, l1);
        l1.remove(l1.size() - 1);
        int j = i + 1;
        while(j < nums.length && nums[i] == nums[j]){
            j++;
        }
        solve(nums , t , j, l1);
    }
}
