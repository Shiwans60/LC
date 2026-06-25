class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int occ = 0;
        int n = nums.length;
        // int l = 0;
        // int r = n - 1;
        // for(int i = 0; i < n; i++){
        //     if(nums[i] == target){
        //         reql = l;
        //         break;
        //     }
        // }
        // for(int i = n-1; i >=0; i--){
        //     if(nums[i] == target){
        //         reqr = r;
        //         break;
        //     }
        //     else if(r == 0){
        //         return 0;
        //     }
        // }
        // for(int i = reql ; i <= reqr i++){
        //     if(nums[i] == target){
        //         count++;
        //     }
        // }
        // int len = reqr - reql + 1;
        // if(len < 2 * count){

        // }
        int res = 0;
        for(int i = 0; i < n ; i++){
            int count = 0;
            for(int j = i ; j < n ; j++){
                if(nums[j] == target){
                    count++;
                }
                if((j - i + 1) < 2 * count){
                    res++;
                }
            }
        }
        return res;


        
    }
}
