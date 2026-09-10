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
    public int averageOfSubtree(TreeNode root) {
        int[] res = new int[1];
        sum(root , res);
        return res[0];
        
    }
    private int[] sum(TreeNode root, int[] res){
        if(root == null){
            return new int[]{0 , 0};
        }
        
        int[] l = sum(root.left, res);
        int[] r = sum(root.right, res);
        int sum = l[0] + r[0] + root.val;
        int c = l[1] + r[1] + 1;
        if(root.val == sum /c){
            res[0]++;
        }
        return new int[]{sum , c};

    }
}
