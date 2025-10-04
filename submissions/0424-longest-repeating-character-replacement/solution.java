class Solution {
    public int characterReplacement(String s, int k) {
        int r = 0;
        int l = 0;
        int maxl = 0;
        int maxc = 0;
        int[] freq = new int[26];
        while(r < s.length()){
            freq[s.charAt(r) - 'A']++;
            maxc = Math.max(maxc, freq[s.charAt(r) - 'A']);
            while((r - l +1) - maxc > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxl = Math.max(r- l +1, maxl);
            r++;
        }
        return maxl;

    }
}
