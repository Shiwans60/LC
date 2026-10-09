class Solution {
    public boolean makesquare(int[] matchsticks) {
        int n = matchsticks.length;
        int s = 0;
        for(int i = 0 ; i < n ; i++){
            s += matchsticks[i];
        }
        int req = s/4;
        Arrays.sort(matchsticks);
        for(int i = 0 , j = matchsticks.length - 1; i < j ; i++ , j--){
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }
        
        if(matchsticks[0] > req || n < 4){
            return false;
        }
        int[] p = new int[4];
        return solve(matchsticks , p , 0 , req );
    }
    private boolean solve(int[] nums, int[] p , int i, int req){
        if(i == nums.length){
            if(p[0] == req && p[1] == req && p[2] == req && p[3] == req) return true;
        }
        for(int j = 0 ; j < 4; j++){
            if(p[j] + nums[i] <= req){
                p[j] += nums[i];
                if(solve(nums , p , i + 1 , req)){
                    return true;
                }
                p[j] -= nums[i];
            }
            if(p[j] == 0){
                break;
            }

        }
        return false;
    }
}
