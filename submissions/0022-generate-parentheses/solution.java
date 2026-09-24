class Solution {
    List<String> l = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
        StringBuilder sb = new StringBuilder(); 
        solve(n , sb);
        return l;
    }
    private void solve(int n,StringBuilder sb){
        if(sb.length() == 2*n){
            if(valid(sb.toString())){
                l.add(sb.toString());
                sb = new StringBuilder();
            }
            return;   
        }
        sb.append('(');
        solve( n, sb);
        sb.deleteCharAt(sb.length() - 1);
        sb.append(')');
        solve( n, sb);
        sb.deleteCharAt(sb.length() - 1);

    }
    private boolean valid(String s){
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            if(!st.isEmpty() && s.charAt(i) == ')' && st.peek() == '('){
                st.pop();
                continue;
            }
            st.add(s.charAt(i));
        }
        return st.isEmpty();
    }
}
