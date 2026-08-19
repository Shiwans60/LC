class Solution {
    public int fib(int n) {
        int one = 1;
        int two = 0;
        if(n == 0) return 0;
        if(n == 1) return 1; 
        int ans = 0;
        for(int i = 2 ; i <= n ; i++){
            ans = one + two;
            two =one ;
            one = ans;  
        }
        return ans;
        
    }
}
