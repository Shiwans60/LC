class Solution {
    private class Pair{
        int first;
        int sec;
        Pair(int i ,int j){
            this.first = i;
            this.sec = j;
        }
    }
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        Queue<Pair> q = new LinkedList<>();
        int[][] h = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            Arrays.fill(h[i], -1);
        }
        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(isWater[i][j] == 1){
                    h[i][j] = 0;
                    q.add(new Pair(i , j));
                }
            }
        }
        int[][] dir = new int[][]{{0,1}, {0, -1}, {1, 0}, {-1, 0}};
        int c = 0;
        while(!q.isEmpty()){
            int N = q.size();
            c++;
            while(N > 0){
                Pair curr = q.poll();
                int i = curr.first;
                int j = curr.sec;
                for(int k = 0 ; k < 4 ;k++){
                    int i_ = i + dir[k][0];
                    int j_ = j + dir[k][1];

                    if(i_ >= 0 && j_ >= 0 && i_ < m && j_ < n && h[i_][j_] == -1){
                        h[i_][j_] = h[i][j] + 1;
                        q.add(new Pair(i_ , j_));
                    }
                    
                }
                N--;     
            }
        }
        return h;


        
    }
}
