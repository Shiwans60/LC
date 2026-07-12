class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Map<Integer, Integer> h1 = new HashMap<>();
        Map<Integer, Integer> h2 = new HashMap<>();
        for(int i = 0; i < n ; i++){
            h1.put(nums1[i], h1.getOrDefault(nums1[i], 0) + 1);

        }
        for(int i = 0; i < m ; i++){
            h2.put(nums2[i], h2.getOrDefault(nums2[i], 0) + 1);

        }
        for(int i = 0 ; i < n ; i++){
            if(h2.get(nums1[i]) == null){
                l1.add(nums1[i]);
                h2.put(nums1[i], h2.getOrDefault(nums1[i], 0) + 1);

            }
        }
        for(int i = 0; i < m; i++){
            if(h1.get(nums2[i]) == null){
                l2.add(nums2[i]);
                h1.put(nums2[i], h1.getOrDefault(nums2[i], 0) + 1);
            }
        }
        l.add(l1);
        l.add(l2);
        return l;

        
    }
}
