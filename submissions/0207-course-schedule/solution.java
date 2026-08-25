class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses;i++){
            adj.add(new ArrayList<>());

        }
        for(int i = 0; i < prerequisites.length; i++){
            int a = prerequisites[i][0];
            int b = prerequisites[i][1];
            adj.get(b).add(a);
        }
        int n = adj.size();
        boolean[] vis = new boolean[n];
        boolean[] path = new boolean[n];
        for(int i = 0 ; i < n ; i++){
            if(!vis[i]){
                if(dfs(adj , i , vis, path)){
                    return false;
                }
            }
        }
        return true;
    
    }
    private boolean dfs(List<List<Integer>> adj, int src ,boolean[] vis, boolean[] path){
        vis[src] = true;
        path[src] = true;
        for(int i : adj.get(src)){
            if(!vis[i]){
                if(dfs(adj , i , vis, path)){
                    return true;
                }
            }
            else if(path[i] == true){
                return true;
            }
        }
        path[src] = false;
        return false;
    }
}
