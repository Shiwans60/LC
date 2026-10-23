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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode knode = getk(temp , k);
            if(knode == null){
                if(prev != null){
                    prev.next = temp;
                    break;
                }
            }
            ListNode nextn = knode.next;
            knode.next = null;
            reverse(temp);
            if(temp == head){
                head = knode;
            }else{
                prev.next = knode;
            }
            prev = temp;
            temp = nextn;

        }
        return head;
    }
    private ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null){
            ListNode nextn = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextn;
        }
        head.next = null;
        head = prev;
        return head;

    }
    private ListNode getk(ListNode head, int k){
        k = k - 1;
        ListNode temp = head;
        while(temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }
}
