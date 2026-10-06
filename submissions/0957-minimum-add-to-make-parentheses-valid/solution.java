class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int open = 0;
        int close = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            
            if(s.charAt(i) == '('){
                st.add('(');
            }else if(!st.isEmpty() && s.charAt(i) == ')' && st.peek() == '('){
                st.pop();
            }else if(s.charAt(i) == ')'){
                st.add(')');
            }
        }
        return st.size();   
    }
}
