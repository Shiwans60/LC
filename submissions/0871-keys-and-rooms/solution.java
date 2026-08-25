class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean vis[] = new boolean[n];
        dfs(rooms , 0 , vis);
        for(int t = 0 ; t < vis.length; t++){
            if(vis[t] == false) return false;
        }
        return true;  
    }
    private void dfs(List<List<Integer>> rooms, int src , boolean[] vis){
        vis[src] = true;
        for(int i : rooms.get(src)){
            if(!vis[i]){
                vis[i] = true;
                dfs(rooms , i , vis);
            }
        }
    }
}
