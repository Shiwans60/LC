class Solution {
    List<List<Integer>> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>(); 
    public List<List<Integer>> combine(int n, int k) {
          
        solve(1, k ,n );
        return l1;
    }
    private void solve(int start, int k ,int n){
        if(k == 0){
            l1.add(new ArrayList<>(l2));
            return;
        }
        if(start > n) return;
        l2.add(start);
        solve(start + 1, k - 1, n);
        l2.remove(l2.size() - 1);
        solve(start + 1, k, n);
    }

}
