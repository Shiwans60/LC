class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<String> l1 = new ArrayList<>();
        List<List<String>> l2 = new ArrayList<>();
        int[] row = new int[n];
        int[] d1 = new int[2*n - 1];
        int[] d2 = new int[2*n - 1];
        String s = ".".repeat(n);
        for(int i = 0; i < n;i++){
            l1.add(s);
        } 
        solve(0, row, d1, d2, l1, l2, n);
        return l2;
    }
    private void solve(int col, int[] row , int[] d1, int[] d2, List<String> l1,List<List<String>> l2, int n){
        if(col == n){
            l2.add(new ArrayList<>(l1));
            return;
        }
        for(int i = 0 ; i < n ; i++){
            if(row[i] == 0 && d1[i + col] == 0 && d2[n- 1 + col - i] == 0){
                char[] arr = l1.get(i).toCharArray();
                arr[col] = 'Q';
                l1.set(i, new String(arr));
                row[i] = 1;
                d1[i + col] =1;
                d2[n -1 + col - i] = 1;
                solve(col + 1, row, d1, d2, l1, l2, n);
                arr = l1.get(i).toCharArray();
                arr[col] = '.';
                l1.set(i, new String(arr));
                row[i] = 0;
                d1[i + col] =0;
                d2[n -1 + col - i] = 0;
            }
        } 

    }
}

