class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> h.get(a) - h.get(b));
        
        for(int e : h.keySet()){
            
            pq.offer(e);
            
            if(pq.size() > k){
                pq.poll();
            } 
        }
        int result[] = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = pq.poll();
        }
        return result;
        
        
    }
}
