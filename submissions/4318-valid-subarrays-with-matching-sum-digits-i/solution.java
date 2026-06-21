class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int ans = 0;
        
        for (int i = 0 ; i < nums.length; i++){
            long sum = 0; 
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                int last = (int)(Math.abs(sum%10));
                long f = sum ;
                while(f >= 10){
                    f /= 10;
                }
                if(f == x && last ==x){
                    ans++;
                }
            }
        }
        return ans;
        
        
    }
}
