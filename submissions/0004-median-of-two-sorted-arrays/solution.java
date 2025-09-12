class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0;
        TreeMap<Integer, Integer> t = new TreeMap<>();

        for (int i = 0; i< nums1.length; i++){
            t.put(nums1[i],t.getOrDefault(nums1[i],0)+1);
        }
        for (int i = 0; i< nums2.length; i++){
            t.put(nums2[i],t.getOrDefault(nums2[i],0)+1);

        }
        List<Integer> l = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : t.entrySet()){
            int freq = entry.getValue();
            for(int i = 0; i < freq; i++){
                l.add(entry.getKey());
            }
        }
        int s = l.size();
        if(s%2 != 0){
            median = l.get((s-1)/2);
        }
        else{
            median = ((double)l.get(s/2)+(double)l.get((s/2) - 1))/2;
        }
        return median;

    }
}
