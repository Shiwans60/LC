class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        long sumt = 0;
        for(int i = 0 ; i < m ; i++ ){
            for(int j = 0; j< n ; j++){
                sumt += grid[i][j];
            }
        } 
        //vertical cut
        long sum1 = 0;
        for(int i = 0 ; i < n - 1 ; i++ ){
            for(int j = 0; j < m ; j++){
                sum1 += grid[j][i];
            }
            
            if(sum1 == sumt - sum1){
                return true;
            }
        }
        //horizontal
        sum1 = 0;
        for(int i = 0 ; i < m - 1; i++ ){
            
            for(int j = 0; j < n ; j++){
                sum1 += grid[i][j];
            }
            if(sum1 == sumt - sum1){
                return true;
            }
        }
        return false;
    }
}
