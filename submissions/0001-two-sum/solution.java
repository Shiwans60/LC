import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length ;j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[0];    
    }


    public static void main(String args[]){
        Solution obj = new Solution();
        int nums[] = {3,4,6,1,5};
        int target = 6;
        int result[] = obj.twoSum(nums,target);
        if (result.length == 2){
            System.out.print(Arrays.toString(result));
        }
    }
}
