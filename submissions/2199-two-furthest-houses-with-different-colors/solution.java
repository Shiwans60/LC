class Solution {
    public int maxDistance(int[] colors) {
        int ans = Integer.MIN_VALUE;
        int d = 0;
        int r = colors.length - 1;
        int l = 0;
        while(l < r){
            if(colors[l] != colors[r]){
                d = r - l;
                ans = Math.max(ans, d);
                break;
            }
            r--;
        }
        r = colors.length - 1;
        l = 0;
        while(l < r){
            if(colors[l] != colors[r]){
                d = r - l;
                ans = Math.max(ans, d);
                break;
            }
            l++; 
        }
        return ans;
        
        
    }
}
