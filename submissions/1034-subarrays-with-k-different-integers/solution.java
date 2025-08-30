class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k-1);
    }


    public int atmost(int[] nums, int k) {
        int l =0;
        int r =0;
        int count = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        while(r< nums.length){
            int i = nums[r];
            h.put(i, h.getOrDefault(i, 0) + 1 );
            while(h.size() > k){
                h.put(nums[l], h.get(nums[l]) -1);
                if ( h.get(nums[l]) == 0){
                    h.remove(nums[l]);
                    
                }
                l++;
            }
            count += r -l+1;
            r++;

        }
        return count;
        
    }
}
