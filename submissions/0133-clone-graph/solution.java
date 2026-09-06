/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Node cnode = new Node(node.val);
        HashMap<Node , Node> mp = new HashMap<>();
        mp.put(node , cnode);
        dfs(node , cnode , mp);
        return cnode;
        
    }
    private void dfs(Node node , Node cnode , HashMap<Node , Node> mp){
        for(Node n : node.neighbors){
            if(!mp.containsKey(n)){
                Node clone = new Node(n.val);
                mp.put(n , clone);
                cnode.neighbors.add(clone);
                dfs(n , clone , mp);
            }
            else{
                
                cnode.neighbors.add(mp.get(n));
            }
        }
    }
}
