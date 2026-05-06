class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n ; i++){
            while(!st.isEmpty() && st.peek() > (num.charAt(i) - '0') && k != 0){
                st.pop();
                k--;
            }
            
            st.push(num.charAt(i) - '0');
        }
        while(k != 0){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        int f = -1;
        for(Integer i : st){
            if(i != 0) f = 1;
            if(f == -1) continue;
            sb.append(i);
        }
        if(sb.length() == 0) sb.append('0');
        return sb.toString();
        
    }
}
