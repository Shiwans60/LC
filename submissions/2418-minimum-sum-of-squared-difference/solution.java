class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long) (k1 + k2);
        int[] arr = new int[100000 + 1];
        int[] diff = new int[nums1.length];
        for(int i = 0 ; i < n; i++){
            int d = Math.abs(nums1[i] - nums2[i]);
            arr[d]++;

        }
        for(int i = 100000; i > 0 && k > 0; i--){
            int ops = (int) Math.min(k ,(long) arr[i]);
            arr[i] -= ops;
            arr[i - 1] += ops;
            k -= ops; 

        }
        long res = 0L;
        for(int i = 1 ; i <= 1e5; i++){
            res += (long) arr[i] * i * i;
        }
        return res;


        
    }
}
