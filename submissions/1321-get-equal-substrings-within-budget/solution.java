class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int m = s.length();
        int l = 0;
        int r = 0;
        int cost = 0;
        int maxl = 0;
        while( r < m){
            cost += Math.abs((int)s.charAt(r) - (int)t.charAt(r));
            while(l < r && cost > maxCost){
                int diff = Math.abs((int)s.charAt(l) - (int)t.charAt(l));
                cost -= diff;
                l++;
            }
            if(cost <= maxCost){
                maxl = Math.max(maxl , r - l+1);
            }
            
            r++;
            
        }
        return maxl;
        
    }
}
