class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int count = 0;
        long ans = 0;
        long abssum = 0;
        int minnum = Integer.MAX_VALUE;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length;j++){
                if(matrix[i][j] < 0){
                    count++;
                }
                minnum = Math.min(minnum,Math.abs(matrix[i][j]));
                abssum += Math.abs(matrix[i][j]);
            }
        }
        if(count%2 == 0){
            ans = abssum;
        }
        else{
            ans = abssum - 2L *minnum;

        }
        return ans;
        
    }
}
