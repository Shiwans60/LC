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
    List<List<Integer>> l = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> l2 = new ArrayList<>();
        solve(root , targetSum, l2);  
        return l; 
    }
    private void solve(TreeNode root , int sum,List<Integer> l2 ){
        if( root == null){
            return;
        }
        
        l2.add(root.val);
        if(sum == root.val && root.left == null && root.right == null){
            l.add(new ArrayList<>(l2));

        }
        solve(root.left, sum - root.val, l2);
        solve(root.right, sum - root.val, l2);
        l2.remove(l2.size() - 1);

    }
}
