class Solution {
    public int maxDistance(String moves) {
        // int U = 1;
        // int R = 1;
        // int L = -1;
        // int D = -1;
        int v = 0;
        int h = 0;
        int c = 0;
        for(int i = 0; i < moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                v++;
            }
            else if(moves.charAt(i) == 'D') v--;
            else if(moves.charAt(i) == 'R') h++;
            else if(moves.charAt(i) == 'L') h--;
            else if(moves.charAt(i) == '_') c++;
        }
        int ans = Math.abs(h) + Math.abs(v) + c;
        return ans;
    }
}
