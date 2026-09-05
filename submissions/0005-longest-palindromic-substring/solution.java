class Solution {
    int strt = 0;
    int e = 0;
    public String longestPalindrome(String s) {
        for(int i = 0 ; i < s.length(); i++){
            solve(s , i , i);
            solve(s , i , i+ 1);
        }
        return s.substring( strt, e + 1);
    }
    private void solve(String s, int l , int r){
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            if(r - l + 1 > e - strt  + 1){
                strt = l;
                e = r;
            }
            r++;
            l--;
        }
        
    }
}
