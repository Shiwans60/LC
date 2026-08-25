class Solution {
    int c = 1;
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean vis[] = new boolean[n];
        dfs(isConnected , 0 , vis);
        for(int i = 0; i < vis.length; i++){
            if(vis[i] == false){
                c++;
                dfs(isConnected , i , vis);
            }
        }
        return c;
    }
    private void dfs(int[][] isConnected , int src , boolean[] vis){
        vis[src] = true;
        for(int i = 0 ; i < isConnected.length; i++){
            if(isConnected[src][i] == 1 && !vis[i]){
                dfs(isConnected, i, vis);
            }
        }
        
    }
}
