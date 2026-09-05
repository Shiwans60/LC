class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0 ; i < s.length(); i++){
            int odd = solve(s , i , i);
            int even = solve(s, i , i + 1);
            count += odd + even;
        }      
        return count;  
    }
    private int solve(String s, int l , int r){
        int c = 0;
        while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            c++;
            l--;
            r++;
        }
        return c;
    }
}
