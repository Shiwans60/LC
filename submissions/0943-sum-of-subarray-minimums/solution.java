class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] ne = new int[n];
        int[] p = new int[n];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        int MOD = (int)1e9 + 7;
        for(int i = 0; i < n ;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                p[i] = -1; 
            }
            else{
                p[i] = st.peek();
            }
            st.push(i);
        }
        long total = 0;
        for(int i = n-1; i >= 0; i--){
            while(!st2.isEmpty() && arr[st2.peek()] >= arr[i]){
                st2.pop();
            }
            if(st2.isEmpty()){
                ne[i] = n;
            }
            else{
                ne[i] = st2.peek();
            }
            st2.push(i);

            long contrib = ((long)(i - p[i]) * (ne[i] - i))% MOD;
            contrib = (contrib * arr[i]) % MOD;
            total = (total + contrib) % MOD;
        }
        
        return (int)total;
        
        
    }
}
