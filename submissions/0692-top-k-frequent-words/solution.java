class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String , Integer> h = new HashMap<>();
        for(int i = 0 ; i < words.length; i++){
            h.put(words[i], h.getOrDefault(words[i], 0) + 1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int comp = h.get(a) - h.get(b);
            if(comp == 0){
                return b.compareTo(a);
            }
            return comp;
        });
        for(String s : h.keySet()){
            pq.offer(s);
            if(pq.size() > k){
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(0,pq.poll());
        }
        return res;
    }
}
