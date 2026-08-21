class Solution {
    List<Integer> l2 = new ArrayList<>();
    List<List<Integer>> l1 = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        solve(nums, 0, l2);
        return l1;
    }
    private void solve(int[] nums, int i, List<Integer> l2){
        if(i >= nums.length){
            l1.add(new ArrayList<>(l2));
            return;
        }
        
        l2.add(nums[i]);
        solve(nums , i + 1, l2);
        l2.remove(l2.size() - 1);
        while(i < nums.length - 1 && nums[i] == nums[i + 1]){
            i++;
        }
        solve(nums , i + 1, l2 );
    }
}
