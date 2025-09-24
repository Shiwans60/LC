class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> l = new ArrayList<>();
        for (int i = 0; i < matrix.length ; i++){
            for ( int j = 0; j < matrix[i].length; j++){
                if ( matrix[i][j] == 0){
                    l.add(new int[]{i,j});
                    
                }
            }

        }
        for (int[] pos : l ){
            for(int m = 0 ; m < matrix[pos[0]].length; m++){
                matrix[pos[0]][m] = 0;
            }
            for(int n = 0 ; n < matrix.length; n++){
                matrix[n][pos[1]] = 0;
            }
        }
        
    }
}

