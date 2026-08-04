class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> st2 = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num = num*10 + (c - '0');
            }
            else if(c == '['){
                st.push(num);
                st2.push(sb);
                sb = new StringBuilder();
                num = 0;
            }
            else if( c == ']'){
                int n = st.pop();
                StringBuilder sb2 = st2.pop();
                while(n-- > 0){
                    sb2.append(sb);
                }
                sb = sb2;
            }
            else{
                sb.append(c);

            }

        }
        return sb.toString();
        
    }
}
