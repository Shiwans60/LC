class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int sum = 0;
        int count = 0;
        h.put(0, 1);
        for (int i : nums){
            sum = sum + i;
            if(h.containsKey(sum - k )){
                count = count + h.get(sum - k);
            }
            h.put(sum , h.getOrDefault(sum, 0)+1);
        }
        return count;
    }

}
