class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int l = 0;
        
        int m = Integer.MIN_VALUE;
        int steps = n - k;
        int r = steps - 1;
        
        int sum = 0;
        int s = cardPoints[0];
        for ( int i = 1; i < n; i++){
            s = s + cardPoints[i];
        }
        if( steps == 0){
            return s;
        }
        for(int i = 0; i < r; i++){
            sum = sum + cardPoints[i];
        }
        
        
        
        while(r < n ){
            sum = sum + cardPoints[r];
            while(r - l + 1 != steps && l < r){
                sum = sum - cardPoints[l];
                l++;
            }
            int c = s - sum;
            m = Math.max(m , c);
            r++;
        }
        return m;   
    }
}
