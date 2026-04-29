class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int r = people.length -1;
        int l = 0;
        int ans = 0;
        while(l <= r){
            if(people[l] + people[r] <= limit){
                // if(l ==r){
                //     ans = ans + 1;
                // }
                // else{
                //     ans = ans+ 2;
                // }
                l++;
            }
            r--;
            ans++;
        }
        return ans;
    }
}
