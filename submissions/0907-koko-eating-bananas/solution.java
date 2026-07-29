class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1;
        int hi = 0;
        for(int i = 0; i < n; i++){
            hi = Math.max(hi, piles[i]);
        }
        int ans = Integer.MAX_VALUE;
        while(l <= hi){
            int m = l + (hi -l)/2;
            long total = cal(piles, m);
            if(total <= h){
                ans = m;
                hi = m - 1;
            }
            else{
                l = m +1;
            }
        }  
        return ans;
    }
    private long cal(int[] piles, int rate){
        long hrs = 0;
        for(int i = 0; i < piles.length; i++){
            hrs += Math.ceilDiv(piles[i], rate);
        }
        return hrs;
    }
}
