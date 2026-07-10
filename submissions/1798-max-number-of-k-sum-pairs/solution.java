class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int ans = 0;
        for(int i : nums){
            int j = k - i;
            if(h.getOrDefault(j, 0) > 0){
                ans++;
                h.put(j, h.get(j) - 1);
            }
            else{
                h.put(i, h.getOrDefault(i, 0) + 1);
            }
        }
        return ans;
        
    }
}
