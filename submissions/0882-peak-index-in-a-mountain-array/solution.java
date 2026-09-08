class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int h = n - 1;
        int l = 0;
        while(l < h){
            int m = l + (h - l )/2;
            if(arr[m] < arr[m+1]){
                l = m + 1;
            }
            else{
                h = m;
            }
        }
        return h;

        
    }
    
}
