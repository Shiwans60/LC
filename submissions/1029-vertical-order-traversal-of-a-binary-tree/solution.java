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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> l = new TreeMap<>();
        Queue<Cell> q = new LinkedList<>();
        q.add(new Cell(root, 0 , 0));
        q.add(new Cell(null, 0, 0));
        while(!q.isEmpty()){
            Cell c = q.poll();
            TreeNode curr = c.node;
            int vertical = c.u;
            int level = c.v;
            if(curr == null){
                if(!q.isEmpty()){
                    q.add(new Cell(null, 0, 0));
                }
                else{
                    break;
                }

            }
            else{
                if(!l.containsKey(vertical)){
                    l.put(vertical, new TreeMap<>());
                }
                if(!l.get(vertical).containsKey(level)){
                    l.get(vertical).put(level, new PriorityQueue<>());
                }
                l.get(vertical).get(level).offer(curr.val);
                if(curr.right != null){
                    q.offer(new Cell(curr.right,vertical +1, level +1));
                }
                if(curr.left != null){
                    q.offer(new Cell(curr.left ,vertical -1, level +1));
                }  

            }

        }
        List<List<Integer>> l1 = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> inner : l.values()){
            List<Integer> l2 = new ArrayList<>();
            for(PriorityQueue<Integer> node : inner.values()){
                while(!node.isEmpty()){
                    l2.add(node.poll());
                }
            }
            l1.add(l2);
        }
        return l1;
    }
}
class Cell{
    TreeNode node;
    int u;
    int v;
    public Cell(TreeNode n, int u , int v){
        this.node = n;
        this.u = u;
        this.v = v;
    }

}
