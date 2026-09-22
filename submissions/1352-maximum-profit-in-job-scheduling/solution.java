class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0 ;i< startTime.length; i++ ){
            List<Integer> temp = new ArrayList<>();
            temp.add(startTime[i]);
            temp.add(endTime[i]);
            temp.add(profit[i]);
            l.add(temp);
        }
        l.sort((a,b) -> Integer.compare(a.get(0), b.get(0)));
        int[] dp = new int[l.size()];
        Arrays.fill(dp , -1);
        return solve(l , 0, dp);
        
    }
    private int solve(List<List<Integer>> l , int j, int[] dp){
        if(j >= l.size()){
            return 0;
        }
        if(dp[j] != -1){
            return dp[j];
        }
        int next = find(l , j + 1 , l.get(j).get(1));
        int take = l.get(j).get(2) + solve(l , next, dp);
        int skip = solve(l , j + 1, dp);
        
        return dp[j] = Math.max(skip , take);  
    }
    private int find(List<List<Integer>> l , int s, int target){
        int e = l.size() - 1;
        int res = l.size();
        while(s <= e){
            int mid = s +(e - s)/2;
            if(l.get(mid).get(0) >= target){
                res = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            } 

        }
        return res;

    }
}

