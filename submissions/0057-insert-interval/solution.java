class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i = 0;
        int n = intervals.length;
        List<int[]> l = new ArrayList<>();
        int arr[];
        while(i < n && intervals[i][1] < newInterval[0]){
            arr = new int[2];
            arr[0] = intervals[i][0];
            arr[1] = intervals[i][1];
            l.add(arr);
            i++;
        }
        arr = new int[2];
        arr[0] = newInterval[0];
        arr[1] = newInterval[1];
        while(i < n && intervals[i][0] <= newInterval[1]){
            arr[0] = Math.min(arr[0], intervals[i][0]);
            arr[1] = Math.max(arr[1], intervals[i][1]);
            i++;
        }
        l.add(arr);
        while(i < n ){
            arr = new int[2];
            arr[0] = intervals[i][0];
            arr[1] = intervals[i][1];
            l.add(arr);
            i++;
        }
        int res[][] = new int[l.size()][2];
        for(int j = 0; j < l.size(); j++){
            res[j] = l.get(j);
        }
        return res;
    }
}
