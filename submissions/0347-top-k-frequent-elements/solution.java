class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < n; i++){
            h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> h.get(b) - h.get(a));
        for(int i : h.keySet()){
            pq.offer(i);
        }
        List<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < k ; i++){
            arr.add(pq.poll());
        }
        int res[] = new int[arr.size()];
        for(int i = 0 ; i < arr.size(); i++){
            res[i] = arr.get(i);
        }
        return res;
    }
}
