class Solution {
    private class Pair{
        int first;
        int sec;
        Pair(int i , int j){
            this.first = i;
            this.sec = j;
        }
        @Override
        public boolean equals(Object obj){
            if(this == obj) return true;
            if(!(obj instanceof Solution.Pair)) return false;
            Pair p = (Pair) obj;
            return first == p.first && sec == p.sec;
        }
        @Override
        public int hashCode(){
            return Objects.hash(first , sec);
        }
    }
    int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int shortestBridge(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        Set<Pair> s = new HashSet<>();
        boolean found = false;
        for(int i = 0 ; i < m && found == false; i++){
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == 1){
                    dfs(grid, i , j , q, s);
                    found = true;
                    break;
                }
            }
        }
        
        int level = 0;
        while(!q.isEmpty()){
            int N = q.size();
            while(N > 0){
                Pair curr = q.poll();
                int i = curr.first;
                int j = curr.sec;
                for(int k = 0 ; k < 4 ; k++){
                    int i_ = i + dir[k][0];
                    int j_ = j + dir[k][1];
                    if(i_ >= 0 && j_ >= 0 && i_ < m && j_ < n && !s.contains(new Pair(i_, j_))){
                        if(grid[i_][j_] == 1){
                            return level;
                        }else{
                            q.add(new Pair(i_, j_));
                            s.add(new Pair(i_, j_));
                        }

                    }

                }
                N--;
            }
            level++;

        }
        return -1;
        
    }
    private void dfs(int[][] grid , int i , int j , Queue<Pair> q, Set<Pair> s){
        
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || s.contains(new Pair(i ,j))){
            return;
        }
        q.add(new Pair(i , j));
        s.add(new Pair(i , j));
        for(int k = 0 ; k < 4; k++){
            int i_ = i+ dir[k][0];
            int j_ = j+ dir[k][1];
                
            dfs(grid, i_, j_ , q, s);
            
        }

    }
}
