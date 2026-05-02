class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] prev = new int[n];
        Stack<Integer> st1 = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st1.isEmpty() && heights[st1.peek()] >= heights[i]){
                st1.pop();
            }
            if(st1.isEmpty()){
                prev[i] = -1;
            }
            else{
                prev[i] = st1.peek();
            }
            st1.push(i);
        }
        Stack<Integer> st2 = new Stack<>();
        int[] next = new int[n];
        int maxA = Integer.MIN_VALUE;
        for(int i = n-1; i >= 0; i--){
            while(!st2.isEmpty() && heights[st2.peek()] >= heights[i]){
                st2.pop();
            }
            if(st2.isEmpty()){
                next[i] = n;
            }
            else{
                next[i] = st2.peek();
            }
            st2.push(i);

            int area = heights[i]*(next[i] - (prev[i] + 1));
            maxA = Math.max(maxA, area);
        }
        return maxA;
        
    }
}
