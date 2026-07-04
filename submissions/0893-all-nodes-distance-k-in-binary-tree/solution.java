/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private void parent(TreeNode root, Map<TreeNode, TreeNode> p){
        Queue<TreeNode> q1 = new LinkedList<>();
        q1.offer(root);
        while(!q1.isEmpty()){
            TreeNode n = q1.poll();
            if(n.left != null){
                p.put(n.left, n);
                q1.offer(n.left);
            }
            if(n.right != null){
                p.put(n.right, n);
                q1.offer(n.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        HashMap<TreeNode, TreeNode> p = new HashMap<>();
        parent(root, p);
        q.offer(target);
        visited.put(target, true);
        int dist = 0;
        while(!q.isEmpty()){
            if(dist == k){
                break;
            }
            int size = q.size();
            dist++;
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                if(curr.left != null && visited.get(curr.left) == null){
                    visited.put(curr.left, true);
                    q.offer(curr.left);
                }
                if(curr.right != null && visited.get(curr.right) == null){
                    visited.put(curr.right, true);
                    q.offer(curr.right);
                }
                if(p.get(curr) != null && visited.get(p.get(curr)) == null){
                    visited.put(p.get(curr) , true);
                    q.offer(p.get(curr));
                } 
            }
        }
        List<Integer> l = new ArrayList<>();
        for(TreeNode t : q){
            l.add(t.val);
        }
        return l;
    }
}
