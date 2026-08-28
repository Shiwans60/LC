class Solution {
    HashSet<String> res = new HashSet<>();
    HashSet<String> vis = new HashSet<>();    
    public List<String> removeInvalidParentheses(String s) {
        int n = s.length();
        int minr = req(s);
        solve(s , minr );
        return new ArrayList<>(res);
    }
    private boolean isvalid(String s){
        int bal = 0;
        for(char c : s.toCharArray()){
            if( c != '(' && c != ')'){
                continue;
            }
            
            if(c == '('){
                bal++;
            }  
            else if( c==')'){
                bal--;
                if(bal < 0){
                    return false;
                }
            }
            
        }
        return bal == 0;
    }
    private int req(String s){
        int bal = 0;
        int rem = 0;

        for(char c : s.toCharArray()){
            if( c != '(' && c != ')'){
                continue;
            }
            if(c == '('){
                bal++;
            }  
            else if(c==')'){
                if(bal > 0){
                    bal--;
                }
                else{
                    rem++;
                }
            }
        }
        return rem + bal;
    }
    private void solve(String s , int minr ){
        String key = s + '#' + minr;
        if(vis.contains(key)) return;
        vis.add(key);
        if(req(s) > minr) return;
        if(minr == 0){
            if(isvalid(s)){
                res.add(s);
            }
            return;
        }
        for(int i = 0; i < s.length(); i++){
            if( s.charAt(i) != '(' && s.charAt(i) != ')'){
                continue;
            }
            if(i > 0  && s.charAt(i) == s.charAt(i - 1)){
                continue;
            }
            String l = s.substring(0 , i);
            String r = s.substring(i+1);
            solve(l + r , minr - 1);
        }
    }
}
