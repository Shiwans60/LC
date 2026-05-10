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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2,0);
        
    }
    public ListNode add(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null && carry == 0){
            return null;
        }
        int val1;
        int val2;
        if(l1 != null){
            val1 = l1.val;
        }
        else{
            val1 = 0;
        }
        if(l2 != null){
            val2 = l2.val;
        }
        else{
            val2 = 0;
        }
        int sum = val1 + val2 + carry;
        int ncarry = sum/10;
        ListNode nnode = new ListNode(sum%10);
        ListNode next1;
        ListNode next2;
        if(l1 != null){
            next1 = l1.next;
        }
        else{
            next1 = null;
        }
        if(l2 != null){
            next2 = l2.next;
        }
        else{
            next2 = null;
        }
        nnode.next = add(next1 ,next2, ncarry);
        return nnode;
        
    }
    
}
