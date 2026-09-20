class Solution {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n + 1];
        int i2 = 1;
        int i3 = 1;
        int i5 = 1;
        arr[1] = 1;
        for(int i = 2; i <= n ; i++){
            int i2ugly = arr[i2] * 2;
            int i3ugly = arr[i3] * 3;
            int i5ugly = arr[i5] * 5;
            int minv = Math.min(i2ugly , Math.min(i3ugly , i5ugly));
            arr[i] = minv;
            if(minv == i2ugly){
                i2++;
            }
            if(minv == i3ugly){
                i3++;
            }
            if(minv == i5ugly){
                i5++;
            }

        }
        return arr[n];
        
    }
    

}
