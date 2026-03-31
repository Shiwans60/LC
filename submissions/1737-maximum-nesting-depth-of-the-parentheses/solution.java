class Solution {
    public int maxDepth(String s) {
        int currc = 0;
        int maxc = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                currc++;
            }
            if(s.charAt(i) == ')'){
                currc--;
            }
            maxc = Math.max(maxc, currc);
        }
        return maxc;
        
    }
}
