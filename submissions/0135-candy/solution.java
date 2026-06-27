class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int l[] = new int[n];
        l[0] = 1;
        int ans = 0;
        for(int i = 1; i < n; i++){
            if(ratings[i] > ratings[i - 1]){
                l[i] = l[i-1] + 1;
            }else{
                l[i] = 1;
            }
        }
        ans = l[n - 1];
        for(int i = n-2 ; i >= 0; i--){
            if(ratings[i] > ratings[i + 1]){
                l[i] = Math.max(l[i], l[i+1] + 1);
            }
            ans = ans + l[i];
        }
        
        return ans;
        
    }
}
