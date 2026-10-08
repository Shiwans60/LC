class Solution {
    List<Integer> l1 = new ArrayList<>();
    public List<Integer> sequentialDigits(int low, int high) {
       
        for(int i = 1; i <= 9 ; i++){
            StringBuilder sb = new StringBuilder();
            solve(low , high , i , sb); 
        }
        Collections.sort(l1);
        return l1;
    }
    private void solve(int l , int h , int num , StringBuilder sb){
        
        if( num > 9 ){
            return;
        }
        
        sb.append(num);
        int n = Integer.parseInt(sb.toString());
        if(n > h) return;
        if(n >= l && n <= h){
            l1.add(n);
        }
        solve(l , h , num + 1, sb);
        
    }
}
