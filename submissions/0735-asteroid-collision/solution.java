class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i : asteroids){
            boolean des = false;
            while(!st.isEmpty() && st.peek() > 0 && i< 0){
                if(st.peek() < -i){
                    st.pop();
                }
                else if(st.peek() == -i){
                    st.pop();
                    des = true;
                    break;
                }
                else{
                    des = true;
                    break;
                }
            }
            if(!des){
                st.push(i);
            }
        }
        int arr[] = new int[st.size()];
        for(int i = st.size() - 1; i >= 0; i--){
            arr[i] = st.pop();
        }
        return arr;
    }
}
