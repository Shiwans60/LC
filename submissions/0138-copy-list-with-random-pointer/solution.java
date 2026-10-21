/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node na = head;
        while(na != null){
            Node curr = new Node(na.val);
            curr.next = na.next;
            na.next = curr;
            na = na.next.next;
        }
        na = head;
        while(na != null){
            if(na.random != null){
                na.next.random = na.random.next;
            }
            
            na = na.next.next;
        }
        na = head;
        Node dummy = new Node(-1);
        Node nb = dummy;
        while(na != null){
            nb.next = na.next;
            nb = nb.next;
            na.next = na.next.next;
            na = na.next;
        }
        return dummy.next;

        
    }
}
