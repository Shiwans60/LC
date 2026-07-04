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
 class Pair{
    TreeNode node;
    int idx;
    public Pair(TreeNode node, int idx){
        this.node = node;
        this.idx = idx;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int ans = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().idx;
            int f = 0;
            int l = 0;
            for(int i = 0; i < size; i++){
                int curridx = q.peek().idx - min;
                TreeNode currnode = q.peek().node;
                q.poll();
                if (i == 0) f = curridx;
                if (i == size - 1) l = curridx;
                if(currnode.left != null){
                    q.add(new Pair(currnode.left , 2*curridx + 1));
                }
                if(currnode.right != null){
                    q.add(new Pair(currnode.right , 2*curridx + 2));
                }
            }
            ans = Math.max(ans, l - f + 1);
        }
        return ans;
        
    }
}
