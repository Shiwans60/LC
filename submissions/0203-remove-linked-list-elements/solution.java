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
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null) return null;
        ListNode na = head;
        while(na.next != null){
            if(na.next.val == val){
                na.next = na.next.next;
            }else{
                na = na.next;
            }
        }
        return head;
        
    }
}
