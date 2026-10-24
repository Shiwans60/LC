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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode na = head;
        int c = 1;
        while( c < k  && na.next != null){
            c++;
            na = na.next;
        }
        ListNode fast = na;
        ListNode slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        int temp = na.val;
        na.val = slow.val;
        slow.val = temp;
        return head;

        
    }
}
