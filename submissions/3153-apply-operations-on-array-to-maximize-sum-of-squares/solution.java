class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int MOD = 1_000_000_007;
        int[] c = new int[32];
        Arrays.fill(c , 0);
        for(int num : nums){
            for(int b = 0 ;b <32 ; b++){
                if((num & (1 << b)) != 0){
                    c[b]++;
                }
            }
        }
        long res = 0L;
        while(k-- > 0){
            long curr = 0L;
            for(int b = 0 ; b < 32 ; b++){
                if(c[b] > 0){
                    c[b]--;
                    curr |= (1L << b);
                }
                
            }
            res = (res + (curr * curr)) % MOD;
        }
        return (int) res;
    }
}
