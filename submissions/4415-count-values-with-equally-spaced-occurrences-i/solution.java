class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n = nums.length;
        int c = 0;
        HashMap<Integer , Integer> h = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            h.put(nums[i] , h.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer , Integer> e : h.entrySet()){
            if(e.getValue() == 3){
                int val = e.getKey();
                int f = -1;
                int s = -1;
                int t = -1;
                for(int i = 0 ; i <n ; i++){
                    if(nums[i] == val){
                        if(f == -1){
                            f = i;
                        }
                        else if(s == -1){
                            s = i;
                        }
                        else if(t == -1){
                            t = i;
                            break;
                        }
                        
                    }
                }
                int diff1 = s - f;
                int diff2 = t - s;
                if(diff1 == diff2 ){
                            c++;
                }
            }
        }
        
        
        return c;
            
    }
}
