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
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int c = 0;

        while(curr != null){

            c++;

            curr = curr.next;

        }
        ListNode curr2 = head;
        int i =0;
        while(i < c/2){
            curr2 = curr2.next;
            i++;
        }
        return curr2;
        
    }
}
