class Solution {
    public int largestAltitude(int[] gain) {
        int s = 0;
        int n = gain.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            s = s + gain[i];
            ans = Math.max(ans, s);
        }
        return ans;  
    }
}
