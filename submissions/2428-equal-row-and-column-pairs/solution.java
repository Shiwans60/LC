class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<List<Integer>, Integer> s1 = new HashMap<>();
        int count = 0;
        for(int[] arr : grid){
            List<Integer> l = new ArrayList<>();
            for(int i : arr){
                l.add(i);
            }
            s1.put(l, s1.getOrDefault(l, 0)+1);
        }
        List<Integer> l2;
        for(int i = 0; i < n; i++){
            l2 = new ArrayList<>();
            for(int j = 0;j < n; j++){
                l2.add(grid[j][i]);
            }
            if(s1.containsKey(l2)){
                count += s1.get(l2);
            }
            
        }
        return count;
        
    }
}
