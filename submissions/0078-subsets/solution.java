class Solution {
    List<Integer> l1 = new ArrayList<>();
    List<List<Integer>> l2 = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums){
        solve(nums, 0, l1);
        return l2;
    }
    private void solve(int[] nums,int i ,List<Integer> l1 ){
        if( i >= nums.length){
            l2.add(new ArrayList<>(l1));
            return;
        }
        l1.add(nums[i]);
        solve(nums, i + 1, l1);
        l1.remove(l1.size() - 1);
        solve(nums, i + 1, l1);
    }
}
