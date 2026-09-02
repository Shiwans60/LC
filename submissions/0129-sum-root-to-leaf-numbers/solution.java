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
    long ans = 0;
    public int sumNumbers(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        solve(root , sb );
        return (int) ans;
    }
    private void solve(TreeNode root, StringBuilder sb ){
        if(root == null){
            return;
        }
        int len = sb.length();
        sb.append(root.val);
        if(root.left == null && root.right == null){
            long val = Long.parseLong(sb.toString());
            ans += val;
        }
        solve(root.left, sb);
        solve(root.right , sb);
        sb.setLength(len);
        return;

    }
}
