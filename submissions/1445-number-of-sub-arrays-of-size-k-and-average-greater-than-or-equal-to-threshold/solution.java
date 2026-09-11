class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int c = 0;
        int l = 0;
        int r= 0;
        int sum = 0;
        while(r < n){
            sum += arr[r];
            
            while(r - l + 1 > k){
                sum -= arr[l];
                l++;
            }
            if(r - l + 1 == k && sum / k >= threshold){
                c++;
            }
            
            r++;
        }
        return c;

        
    }
}
