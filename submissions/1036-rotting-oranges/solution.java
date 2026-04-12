class Pair{
    int row = 0;
    int col = 0;
    int t = 0;
    Pair(int _row,int _col ,int _t){
        this.row = _row;
        this.col = _col;
        this.t = _t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int vis[][] = new int[n][m];
        int freshcount = 0;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < m ; j++){
                if(grid[i][j] == 2){
                    vis[i][j] = 1;
                    q.add(new Pair(i , j, 0));
                }
                else{
                    vis[i][j] = 0;
                }
                if(grid[i][j] == 1){
                    freshcount++;
                }

            }
        }
        int[] sider = {-1, 0, 1, 0};
        int[] sidec = {0, -1, 0 , 1};
        int countf = 0;
        int tm = 0;
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int time = q.peek().t;
            tm = time;
            q.remove();
            for(int i = 0; i < 4; i++){
                int newr = r + sider[i];
                int newc = c + sidec[i];
                if(newr >= 0 && newr < n && newc >= 0 && newc < m && vis[newr][newc] == 0 && grid[newr][newc] == 1){
                        vis[newr][newc] = 1;
                        q.add(new Pair(newr , newc , time +1));
                        countf++;
                }   
            }

        }
        if(countf != freshcount) return -1;
        else return tm;
    }
}
