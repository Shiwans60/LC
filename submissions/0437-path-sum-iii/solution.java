/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        return pathSum(root.left, targetSum) + solve(root,(long) targetSum) + pathSum(root.right, targetSum);
    }
    private int solve(TreeNode root , long sum){
        if(root == null) return 0;
        int c = 0;
        if(root.val == sum){
            c++;
        }
        c += solve(root.left, sum - root.val);
        c += solve(root.right, sum - root.val);
        return c;
    }
}
