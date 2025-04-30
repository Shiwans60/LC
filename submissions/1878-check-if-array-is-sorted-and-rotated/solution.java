class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;

        int[] checksorted = new int[n];
        for (int rotationoffset = 0; rotationoffset < n ;++rotationoffset){
            int currindex  = 0;
            for (int index = rotationoffset; index <n; ++index){
                checksorted[currindex++] = nums[index];

            }
            for (int index = 0; index < rotationoffset; ++index){
                checksorted[currindex++] = nums[index];
            }
            boolean isSorted = true;
            for (int index = 0; index < n-1; ++index){
                if(checksorted[index]> checksorted[index+1]){
                    isSorted = false;
                    break;
                }
            }
            if (isSorted){
                return true;
            }


        }
        return false;

        
    }
}
