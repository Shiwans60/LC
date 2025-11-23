class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        for(char c : String.valueOf(n).toCharArray()){
            int digit = c - '0';
            if(digit != 0){
                sum = sum + digit;
                x = x*10 + digit;
            }
        }
        return x*sum;
        
    }
}
