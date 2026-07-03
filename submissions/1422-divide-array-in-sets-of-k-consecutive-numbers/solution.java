class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        TreeMap<Integer, Integer> t = new TreeMap<>();
        int n = nums.length;
        if(n % k != 0) return false;
        for(int i = 0; i < n; i++){
            t.put(nums[i], t.getOrDefault(nums[i] , 0) + 1);
        }
        while(!t.isEmpty()){
            int curr = t.firstKey();
            t.put(curr, t.get(curr) - 1);
            if(t.get(curr) == 0){
                t.remove(curr);
            }
            for(int i = 1; i < k; i++){
                int y = curr + 1;
                if(t.containsKey(y)){
                    t.put(y, t.get(y) - 1);
                    if(t.get(y) == 0){
                        t.remove(y);
                    }
                    curr = y;
                }
                else{
                    return false;
                }  
                
            }
        }
        return true;
    }
    
}
