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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = new ListNode();
        odd = head;
        ListNode even = new ListNode();
        even = head.next;
        ListNode n = new ListNode();
        n = even;
    
        
        while(even != null && even.next != null ){
            
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            
            even = even.next;
        }
        odd.next = n;
        return head;

        
    }
}
