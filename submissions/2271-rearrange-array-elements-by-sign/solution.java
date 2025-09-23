class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        int arr[] = new int[nums.length];
        for(int i =0; i < nums.length; i++){
            if ( nums[i] < 0 && p2 < nums.length){
                arr[p2] = nums[i];
                p2 = p2 + 2;  
            }
            else if( nums[i] > 0 && p1 < nums.length){
                arr[p1] = nums[i];
                p1 = p1 + 2;
            }
        }
        return arr;
        
    }
}
