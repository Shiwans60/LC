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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode na = dummy;
        int sum = 0;
        Map<Integer, ListNode> m = new HashMap<>();
        while(na != null){
            sum += na.val;
            m.put(sum, na);
            na = na.next;

        }
        sum = 0;
        na = dummy;
        while(na != null){
            sum += na.val;
            na.next = m.get(sum).next;
            na = na.next;
        }
        return dummy.next;
    }
}
