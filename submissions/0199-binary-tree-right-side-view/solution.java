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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int x = 0;
        if(root == null){
            return l;
        }
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            if(curr == null){
                l.add(x);
                
                if(!q.isEmpty()){
                    q.add(null);
                }
                else{
                    break;
                }
            }
            else{
                x = curr.val;
                
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }

        } 
        return l; 
    }
}
