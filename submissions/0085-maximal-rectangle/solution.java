class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int maxa = 0;
        int[][] level = new int[m][n];
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < m; j++){
                sum += Character.getNumericValue(matrix[j][i]);
                
                if(matrix[j][i] == '0'){
                    sum = 0;
                }
                level[j][i] = sum;
            }
        }
        for(int i = 0; i < m; i++){
            maxa = Math.max(maxa, calhist(level[i]));
        }
        return maxa;
    }
    private int calhist(int[] arr){
        int n = arr.length;
        int maxa = 0;
        Stack<Integer> st = new Stack<>();
        int[] prev = new int[n];
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                prev[i] = -1;
            }
            else{
                prev[i] = st.peek();
            }
            st.push(i);
        }
        int[] nxt = new int[n];
        Stack<Integer> st2 = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!st2.isEmpty() && arr[st2.peek()] >= arr[i]){
                st2.pop();

            }
            if(st2.isEmpty()){
                nxt[i] = n;
            }
            else{
                nxt[i] = st2.peek();
            }
            st2.push(i);
            int area  = arr[i] * (nxt[i] - prev[i] -1);
            maxa = Math.max(maxa, area);
        }
        return maxa;
    }
}
