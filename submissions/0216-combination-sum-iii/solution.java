class Solution {
    List<List<Integer>> l2 = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> l1 = new ArrayList<>();
        solve(1, n, l1, k); 
        return l2;
        
    }
    private void solve(int num ,int n, List<Integer> l1, int k){
        if(n == 0 && l1.size() == k){
            l2 .add(new ArrayList<>(l1));
            l1 = new ArrayList<>();
            return;
        }
        if(n < 0 || num > 9){
            return;
        }
        l1.add(num);
        solve(num + 1, n - num, l1, k);
        l1.remove(l1.size() - 1);
        solve(num + 1, n , l1, k);
    }
}
