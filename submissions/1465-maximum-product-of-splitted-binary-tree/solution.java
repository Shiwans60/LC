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
    private static final int MOD = 1_000_000_007;
    private long maxp = Integer.MIN_VALUE;
    private long totalSum = 0;
    public int maxProduct(TreeNode root) {
        
        totalSum = totalsum(root);

        maxsum(root);
        return (int) (maxp%MOD);
    
    }
    private long totalsum(TreeNode node){
        if(node == null) return 0;
        return node.val + totalsum(node.left) + totalsum(node.right);
    }
    private long maxsum(TreeNode node){
        if(node == null) return 0;
        long leftsum = maxsum(node.left);
        long rightsum = maxsum(node.right);
        long maxsum = node.val + leftsum + rightsum;
        maxp = Math.max(maxp, (totalSum - maxsum)*maxsum);
        return maxsum;

    }

}
