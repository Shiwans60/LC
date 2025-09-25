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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int c =0;
        while(curr != null){
            c++;
            curr = curr.next;
        }
        int req = c - n ;
        int i = 1;
        ListNode curr2 = head;
        if( n == c){
            return head.next;
        }
        while(i < req ){
            i++;
            curr2 = curr2.next;
            
        }
        curr2.next = curr2.next.next;
        return head;

        
    }
}
