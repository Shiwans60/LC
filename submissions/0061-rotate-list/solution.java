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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        int c = 1;
        while(curr.next != null){
            curr = curr.next;
            c++;
        }
        k = k % c;
        if(k == 0) return head;
        int req = c - k;

        ListNode curr2 = head;
        int i = 1;
        while(i < req){
            i++;
            curr2 = curr2.next;
        }
        curr.next = head;
        head = curr2.next;
        curr2.next = null;

        return head;
    }
}
