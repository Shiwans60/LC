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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0; i < inorder.length; i++){
            h.put(inorder[i], i);
        }
        TreeNode root = build(preorder,0,preorder.length - 1,inorder, 0, inorder.length - 1, h);
        return root;
    }
    private TreeNode build(int[] preorder,int pres,int pree,int[] inorder,int ins,int ine,HashMap<Integer,Integer> h){
        if(pres > pree || ins > ine) return null;
        TreeNode root = new TreeNode(preorder[pres]);
        int inindx = h.get(root.val); 
        int leftcount = inindx - ins;
        root.left = build(preorder, pres + 1, pres + leftcount,inorder, ins, inindx-1, h );
        root.right = build(preorder, pres + leftcount + 1, pree, inorder, inindx + 1, ine, h);
        return root;
    }
}
