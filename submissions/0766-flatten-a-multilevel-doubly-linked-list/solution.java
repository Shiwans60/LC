/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
class Solution {
    public Node flatten(Node head) {
        if(head == null){
            return null;
        }
        Node na = head;
        while(na != null){
            if(na.child != null){
                Node next = na.next;
                Node child = flatten(na.child);
                na.next = child;
                child.prev = na;
                na.child = null;
                Node tail = child;
                while(tail.next != null){
                    tail = tail.next;
                }
                tail.next = next;
                if(next != null){
                    next.prev = tail;
                }

            }
            na = na.next;
        }
        return head; 
    }
}
