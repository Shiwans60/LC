class Solution {
    List<List<Integer>> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        solve(l2, map, n);
        return l1;
    }
    private void solve(List<Integer> l2 , HashMap<Integer, Integer> map, int n){
        if(l2.size() == n){
            l1.add(new ArrayList<>(l2));
            return;
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == 0) continue;
            l2.add(e.getKey());
            map.put(e.getKey(), e.getValue() - 1);

            solve(l2, map, n);

            l2.remove(l2.size() - 1);
            map.put(e.getKey() , map.get(e.getKey()) + 1);
        }
    }
}
