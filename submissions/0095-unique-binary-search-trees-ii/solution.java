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
    public List<TreeNode> generateTrees(int n) {
        return solve(1, n);
    }
    private List<TreeNode> solve(int strt , int end){
        List<TreeNode> res = new ArrayList<>();
        if(strt > end){
            res.add(null);
            return res;
        }
        if(strt == end){
            TreeNode root = new TreeNode(strt); 
            res.add(new TreeNode(strt));
            return res;
        }
        for(int i = strt ; i <= end; i++){
            List<TreeNode> left = solve(strt, i -1);
            List<TreeNode> right = solve(i + 1, end);
            for(TreeNode j : left){
                for(TreeNode k : right){
                    TreeNode root = new TreeNode(i);
                    root.left = j;
                    root.right = k;
                    res.add(root);
                }
            }

        }
        return res;
    }
}
