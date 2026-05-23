class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> h = new HashMap<>();
        for(int i : nums){
            h.put(i, h.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            int ans = h.get(a) - h.get(b);
            if(ans == 0){
                return b - a;
            }
            return ans;
        });
        for(int i : h.keySet()){
            pq.add(i);
        }
        List<Integer> l = new ArrayList<>();
        while(!pq.isEmpty()){
            int i = pq.poll();
            int freq = h.get(i);
            for(int k = 0; k < freq; k++){
                l.add(i);
            }
        }
        int[] arr = l.stream().mapToInt(Integer::intValue).toArray();
        return arr;

        
    }
}
