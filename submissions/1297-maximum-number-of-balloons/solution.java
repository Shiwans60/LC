class Solution {
    public int maxNumberOfBalloons(String text) {
        int m = text.length();
        int cb = 0;
        int ca = 0;
        double cl = 0;
        double co = 0;
        int cn = 0;

        for(int i = 0; i < m ;i++){
            if(text.charAt(i) == 'b') cb++;
            if(text.charAt(i) == 'a') ca++;
            if(text.charAt(i) == 'l') cl = cl + 0.5;
            if(text.charAt(i) == 'o') co = co + 0.5;
            if(text.charAt(i) == 'n') cn++;
        }
        double ans = Math.min(cn,Math.min(co, Math.min(cl,Math.min(cb, ca))));
        
            return (int)ans;
        
        
    }
}
