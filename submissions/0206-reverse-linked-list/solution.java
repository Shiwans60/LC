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
    public ListNode reverseList(ListNode head) {
        
        ListNode curr = head;
        if(curr == null || curr.next == null ) return curr;
        ListNode nex = reverseList(curr.next);
        curr.next.next = curr;
        curr.next = null;
        return nex;
    }
}
