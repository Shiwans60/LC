/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        ListNode na = head;
        if(head == null || head.next == null){
            return head;
        }
        int count = 0;
        while(na != null){
            count++;
            na = na.next;
        }
        na = head;
        int i = 0;
        while( i < (count+1)/2 - 1){
            i++;
            na = na.next;

        }
        ListNode nb = na.next;
        na.next = null;
        na = head;
        na = sortList(na);
        nb = sortList(nb);
        return merged(na, nb);
    }
    public ListNode merged(ListNode na, ListNode nb){
        ListNode dummy = new ListNode(-1);
        ListNode n = dummy;
        while(na != null && nb != null){
            if(na.val < nb.val){
                n.next = na;
                n = na;
                na = na.next;
            }
            else{
                n.next = nb;
                n = nb;
                nb = nb.next;
            }
        }
        if(na != null){
            n.next = na;
        }
        else{
            n.next = nb;
        }
        return dummy.next;

    }
}
