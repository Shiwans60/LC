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
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxp;
        
    }
    int maxp = Integer.MIN_VALUE;
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int ls = Math.max(0,dfs(root.left));
        int rs = Math.max(0,dfs(root.right));
        int sum = ls + rs + root.val;
        maxp = Math.max(maxp, sum);
        
        return root.val + Math.max(ls, rs);


    }
}
