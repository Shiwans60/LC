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
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        List<String> l = new ArrayList<>();
        solve(root , sb , l);
        return l;
        
        
    }
    private void solve(TreeNode root , StringBuilder sb, List<String> l){
        if(root == null) return;
        int n = sb.length();
        if(n > 0){
            sb.append("->");
        }
        sb.append(root.val);
        if(root.left == null && root.right == null){
            l.add(sb.toString());
        }
        solve(root.left, sb , l);
        solve(root.right, sb , l);
        sb.setLength(n);

    }
}
