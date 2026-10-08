class Solution {
    List<List<Integer>> l2 = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> l1 = new ArrayList<>();
        solve(candidates , target , 0, l1);
        return l2;
    }
    private void solve(int[] nums , int t, int i, List<Integer> l1){
        if(i >= nums.length){
            l1 = new ArrayList<>();
            return;
        }
        if(t < 0 ) return;
        if(t == 0){
            l2.add(new ArrayList<>(l1));
            l1 = new ArrayList<>();
            return;
        }
        l1.add(nums[i]);
        solve(nums , t - nums[i], i, l1);
        l1.remove(l1.size() - 1);
        solve(nums , t , i + 1, l1);

    }
}
