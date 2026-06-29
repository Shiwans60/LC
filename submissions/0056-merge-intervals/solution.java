class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> l = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        for (int[] arr1 : intervals){
            List<Integer> k = new ArrayList<>();
            k.add(arr1[0]);
            k.add(arr1[1]);
            l.add(k); 
        }

        for(int i = 1; i < l.size() ; i++){
            int prevs = l.get(i -1).get(0);
            int preve = l.get(i -1).get(1);
            int currs = l.get(i).get(0);
            int curre = l.get(i).get(1);
            if(currs <= preve){
                l.get(i).set(0, Math.min(prevs , currs));
                l.get(i).set(1, Math.max(preve, curre));
                l.remove(i -1);
                i--;
            }
        }
        int ans[][] = new int[l.size()][2];
        for(int i = 0; i < l.size(); i++){
            ans[i][0] = l.get(i).get(0);
            ans[i][1] = l.get(i).get(1);
        }
        return ans;
    }
}
