class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else if(st.size() == 0 && (ch == ')' || ch == ']' || ch == '}') ) return false;
            else if(ch == ')'){
                if(st.peek() == '('){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch == ']'){
                if(st.peek() == '['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch == '}'){
                if(st.peek() == '{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.size() != 0){
            return false;
        }
        else{
            return true;
        }
        

        
    }
}
