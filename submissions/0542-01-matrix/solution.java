class Solution {
    private class Pair{
        int first;
        int sec;
        Pair(int i , int j){
            this.first = i;
            this.sec = j;
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        Queue<Pair> q = new LinkedList<>();
        int[][] dir = {{0,1}, {0, -1}, {1, 0}, {-1, 0}};
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        for(int i = 0 ; i <m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j] == 0){
                    ans[i][j] = 0;
                    q.add(new Pair(i , j));
                }else{
                    ans[i][j] = -1;
                }
            }
        }
        while(!q.isEmpty()){
            int N = q.size();
            while( N > 0){
                Pair curr = q.poll();
                int i = curr.first;
                int j = curr.sec;
                for(int k = 0 ; k < 4; k++){
                    int i_ = i + dir[k][0];
                    int j_ = j + dir[k][1];

                    if(i_ >= 0 && j_ >= 0 && i_ < ans.length && j_ < ans[0].length && ans[i_][j_] == -1){
                        ans[i_][j_] = ans[i][j] + 1;
                        q.add(new Pair(i_, j_));  
                    }
                }
                N--;

            }
        }
        return ans;
    }
}
