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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode marker = new TreeNode(-1);
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr = q.remove();
            
            if(curr == null){
                if(checkstatus(l2) == false){
                    return false;
                }                
                l2 = new ArrayList<>();
                if(!q.isEmpty()){
                    q.add(null);
                }
                else{
                    break;
                }

            }
            else{
                if(curr == marker){
                    l2.add(null);
                    continue;
                }
                l2.add(curr.val);
                if(curr.left == null){
                    q.add(marker);
                }else{
                    q.add(curr.left);
                }

                if(curr.right == null){
                    q.add(marker);
                }else{
                    q.add(curr.right);
                }
                
            }
        }
        return true;
    }
    private boolean checkstatus(List<Integer> l2){
        int n = l2.size();
        int l = n/2 - 1;
        int r = n/2;
        while(l >= 0 && r < n){
            if(!Objects.equals(l2.get(l), l2.get(r))){
                return false;
            }
            l--;
            r++;
        }
        return true;
    }
}
