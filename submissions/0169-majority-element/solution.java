class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> h = new HashMap<>();
        for (int i= 0; i < nums.length ; i++){
            h.put(nums[i], h.getOrDefault(nums[i],0)+1);
            if(h.containsKey(nums[i]) && h.get(nums[i]) > nums.length/2){
                return nums[i];    
            }
        }
        return 0;
        
    }
}
