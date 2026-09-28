class Solution {
    int c = 0;
    public int eraseOverlapIntervals(int[][] intervals) { 
        Arrays.sort(intervals , (a, b) -> a[0] - b[0]);
        solve(intervals , 0 , 1);
        return c; 
    }
    private void solve(int[][] intervals , int i , int j){
        if(j >= intervals.length){
            return;
        }
        if(intervals[i][1] <= intervals[j][0]){
            i = j;
            j++;
            solve(intervals, i , j);
        }
        else if(intervals[i][1] > intervals[j][0]){
            if(intervals[i][1] <= intervals[j][1]){
                c++;
                j += 1;
                solve(intervals , i , j);
            }
            else if(intervals[i][1] > intervals[j][1]){
                c++;
                i = j;
                j += 1;
                solve(intervals, i , j);

            }
        }
    }
}
