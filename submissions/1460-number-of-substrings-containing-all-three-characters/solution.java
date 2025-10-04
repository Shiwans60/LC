class Solution {
    public int numberOfSubstrings(String s) {
        long ans = total(s) - zero(s);
        return (int) ans;
    }
    public long zero(String s){
        int l = 0;
        int r = 0;
        int counta = 0;
        int countb = 0;
        int countc = 0;
        long count = 0;
        while( r < s.length()){
            if(s.charAt(r) == 'a'){
                counta++;
            }
            if(s.charAt(r) == 'b'){
                countb++;
            }
            if(s.charAt(r) == 'c'){
                countc++;
            }
            while(counta > 0 && countb > 0 && countc > 0){
                if(s.charAt(l) == 'a'){
                counta--;
                }
                if(s.charAt(l) == 'b'){
                countb--;
                }
                if(s.charAt(l) == 'c'){
                countc--;
                }

                l++;
            }
            count = count + ( r - l +1);
            r++;
        }
        return count;
    }
    public long total(String s){
        long n = s.length();
        return n*(n+1)/2;
    }
}
