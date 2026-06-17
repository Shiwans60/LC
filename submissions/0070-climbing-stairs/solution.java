class Solution {
    public int climbStairs(int n) {
        if(n <= 2){
            return n;
        }
        int prv2= 1;
        int prv = 2;
        for(int i = 3; i <=n; i++){
            int curr = prv +prv2;
            prv2 = prv;
            prv = curr;
        }
        return prv;
    }
}
