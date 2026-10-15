class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        int n = nums.size();
        Set<Integer> s = new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            s = new HashSet<>();
            for(int j = i ; j< n ; j++){
                s.add(nums.get(j));
                ans += Math.pow(s.size(), 2);
            }
        }
        return ans;
        
    }
}
