class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int l = 0;
        int r = 0;
        int max = Integer.MIN_VALUE;
        TreeMap<Integer, Integer> t = new TreeMap<>();
        while(r < nums.length){
            
            t.put(nums[r], t.getOrDefault(nums[r],0)+1);
            while(!t.isEmpty() && (t.lastKey() - t.firstKey()) > limit){
                if(t.containsKey(nums[l])){
                    int freq = t.get(nums[l]);
                    if(freq > 1){
                        t.put(nums[l], freq - 1);
                    }
                    else{
                        t.remove(nums[l]);
                    }
                }
                l++;
            }
            max = Math.max(max, r-l +1);
            r++;
        }
        return max;
        
    }
}
