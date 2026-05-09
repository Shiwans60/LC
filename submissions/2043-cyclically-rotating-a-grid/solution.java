class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int layers = Math.min(m,n)/2;
        for(int layer = 0 ; layer < layers; layer++){
            rotate(grid, layer, k);
        }
        return grid;
    }
    private void rotate(int[][] grid, int layer , int k){
        int m = grid.length;
        int n = grid[0].length;
        int top = layer;
        int left = layer;
        int bottom = m - layer -1;
        int right = n - layer - 1;
        int len = 2* (bottom - top + right - left);
        k = k% len;
        if(k == 0) return;
        int[] rot = new int[len];
        int idx = 0;


        for(int i = left; i <= right; i++ ){
            rot[idx] = grid[top][i];
            idx++;
        }
        for(int i = top + 1; i <= bottom; i++){
            rot[idx] = grid[i][right];
            idx++;
        }
        for(int i = right - 1; i >= left; i--){
            rot[idx] = grid[bottom][i];
            idx++;
        }
        for(int i = bottom - 1; i > top; i--){
            rot[idx] = grid[i][left];
            idx++;
        }
        
        
        idx = 0;

        for(int i = left; i <= right; i++){
            grid[top][i] = rot[(idx + k) % len];
            idx++;
        }
        for(int i = top +1 ; i <= bottom; i++){
            grid[i][right] = rot[(idx + k) % len];
            idx++;
        }
        for(int i = right - 1; i >= left; i-- ){
            grid[bottom][i] = rot[(idx + k) % len];
            idx++;
        }
        for(int i = bottom - 1; i > top; i--){
            grid[i][left] = rot[(idx + k) % len];
            idx++;
        }
        
        
        
        

    }
}
