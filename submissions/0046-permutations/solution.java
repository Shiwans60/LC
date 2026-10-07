class Solution {
    List<List<Integer>> l2 = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        List l1 = new ArrayList<>();
        solve(nums , l1 );
        return l2;
    }
    private void solve(int[] nums , List<Integer> l1){
        if(l1.size() == nums.length){
            l2.add(new ArrayList<>(l1));
            l1 = new ArrayList<>();
            return;
        }
        for(int i = 0 ; i < nums.length; i++){
            if(l1.contains(nums[i])) continue;
            else{
                l1.add(nums[i]);
                solve(nums , l1);
                l1.remove(l1.size() - 1);
            }
        }
    }
}
