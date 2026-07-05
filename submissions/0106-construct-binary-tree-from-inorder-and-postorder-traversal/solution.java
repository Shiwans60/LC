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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < inorder.length ; i++){
            h.put(inorder[i], i);
        }
        TreeNode root = build(inorder, 0, inorder.length - 1, postorder, postorder.length - 1, 0, h);
        return root;
    }
    private TreeNode build(int[] inorder,int ins,int ine, int[] postorder, int posts, int poste, HashMap<Integer, Integer> h){
        if(ins > ine || posts < poste) return null;
        TreeNode root = new TreeNode(postorder[posts]);
        int inindx = h.get(root.val);
        int rightcount = ine - inindx;
        root.right = build(inorder, inindx + 1, ine, postorder, posts - 1, posts - rightcount, h );
        root.left = build(inorder , ins, inindx - 1, postorder,posts - rightcount -1, poste, h);
        return root;
    }
}
