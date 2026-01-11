class Solution {
    public boolean isHappy(int n) {
        int s = n;
        int f = n;
        do{
            s = nextnum(s);
            f = nextnum(nextnum(f));

        }while(s != f);

        return s == 1;
    }
    private int nextnum(int num){
        int sum =0;
        while(num > 0){
            int digit = num%10;
            sum += digit*digit;
            num = num/10;
        }
        return sum;
    }
}
