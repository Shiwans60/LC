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
    public int pairSum(ListNode head) {
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        curr = head;
        if(count == 2){
            return curr.val + curr.next.val;
        }
        int i = 0;
        while(i < (count/2) -1){
            curr = curr.next;
            i++;
        }
        ListNode c1 = curr.next;
        curr.next = null;
        
        ListNode prev = null;
        ListNode c = c1;
        while(c != null){
            ListNode n = c.next;
            c.next = prev;
            prev = c;
            c = n;
        }
        curr = head;
        int maxsum = 0;
        i = 0;
        while(i < count/2){
            int sum = curr.val + prev.val;
            curr = curr.next;
            prev = prev.next;
            maxsum = Math.max(maxsum, sum);
            i++;
        }
        return maxsum;
    }
}
