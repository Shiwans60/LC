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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return l1;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size= q.size();
            
            while(size != 0){
                TreeNode currNode = q.remove();
                l2.add(currNode.val);
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
                size--;

            }
            l1.add(l2);
            l2 = new ArrayList<>();
            // if(currNode == null){
            //     l1.add(l2);
            //     l2 = new LinkedList<>();
            //     if(q.isEmpty()){
            //         break;
            //     }else{
            //         q.add(null);
            //     }
            // }else{
            //     l2.add(currNode.val);
            //     if(currNode.left != null){
            //         q.add(currNode.left);
            //     }
            //     if(currNode.right != null){
            //         q.add(currNode.right);
            //     }
            // }

        } 
        return l1;  
    }
}
