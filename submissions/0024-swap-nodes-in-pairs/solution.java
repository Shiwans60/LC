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
    public ListNode swapPairs(ListNode head) {
        ListNode f = head;
        ListNode prev = null;

        while(f != null && f.next != null){
            ListNode s = f.next;
            f.next = s.next;
            s.next = f;
            if(prev == null){
                head = s;
            }
            else{
                prev.next = s;
            }
            prev = f;
            f = f.next;

        }
        return head;

        
        
    }
}
