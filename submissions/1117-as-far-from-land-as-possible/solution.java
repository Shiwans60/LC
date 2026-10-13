class Solution {
    private class Pair{
        int first;
        int sec;
        Pair(int i , int j){
            this.first = i;
            this.sec = j;
        }
    }

    public int maxDistance(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == 1){
                    q.add(new Pair(i , j));
                }
            }
        }
        if(q.isEmpty() || q.size() == m*n){
            return -1;
        }
        int c= -1;
        int[][] dir = {{0, 1}, {0 ,-1}, {1, 0}, {-1, 0}};
        while(!q.isEmpty()){
            int N = q.size();
            c++;
            while(N > 0){
                Pair curr = q.poll();
                int i = curr.first;
                int j = curr.sec;
                for(int k = 0 ; k < 4 ; k++){
                    int i_ = i+ dir[k][0];
                    int j_ = j+ dir[k][1];
                    if(i_ >= 0 && j_ >= 0 && i_ < m && j_ < n && ans[i_][j_] == 0){
                        ans[i_][j_] = ans[i][j] + 1;
                        q.add(new Pair(i_, j_));
                    }
                }
                N--;
            }
            
        }
        return c;

        
    }
}
