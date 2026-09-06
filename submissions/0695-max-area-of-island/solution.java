class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int area = 0;
        for(int i = 0 ;i < m ; i++){
            for(int j = 0; j< n ;j++){
                int count = dfs(grid , i , j);
                area = Math.max(area , count);
            }
        }
        return area;
        
    }
    private int dfs(int[][] grid , int i , int j){
        int m = grid.length;
        int n = grid[0].length;
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != 1){
            return 0;
        }
        grid[i][j] = '#';
        return 1+ dfs(grid , i+1, j)+
        dfs(grid , i, j+1)+
        dfs(grid , i-1, j)+
        dfs(grid , i, j -1);
    }
}
