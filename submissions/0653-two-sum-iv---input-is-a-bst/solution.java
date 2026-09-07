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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> s = new HashSet<>();
        return solve(root , s , k);
        
    }
    private boolean solve(TreeNode root , HashSet<Integer> s , int k){
        if(root == null) return false;
        
        if(s.contains(k - root.val)){
            return true;
        }
        s.add(root.val);
        return solve(root.left , s, k ) ||
        solve(root.right , s , k);
        
    }
}
