class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int r = k - 1;
        int countv = 0;
        int n = s.length();
        int maxc = 0;
        for(int i = 0;i < r; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ){
                countv++;
            }
        }
        while(r < n){
            if(s.charAt(r) == 'a' || s.charAt(r) == 'e' || s.charAt(r) == 'i' || s.charAt(r) == 'o' || s.charAt(r) == 'u'){
                countv++;
            }
            maxc = Math.max(maxc, countv);
            r++;
            if(s.charAt(l) == 'a' || s.charAt(l) == 'e' || s.charAt(l) == 'i' || s.charAt(l) == 'o' || s.charAt(l) == 'u'){
                countv--;
            }
            l++;
        }
        return maxc;
    }
}
