class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>() ;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            h.put(nums[i], h.getOrDefault(nums[i], 0) +1);
        }
        for(Map.Entry<Integer, Integer> e : h.entrySet()){
            if( e.getValue() > nums.length/3){
                l.add(e.getKey());
            }
        }
        return l;
        
    }
}
