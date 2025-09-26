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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null || head == null){
            return true;
        }
        ListNode na = head;
        int count = 0;
        while(na != null){
            count++;
            na= na.next;
        }
        na = head;
        if(count == 2){
            if(na.val != na.next.val){
                return false;
            }
            else{
                return true;
            }
        }
        int n = count/2;
        int i = 0;    
        while(i < n - 1 ){
            i++;
            na = na.next;
        }
        ListNode nb = na.next;
        na.next = null;
        na = head;
        ListNode prev = null;
        ListNode curr = nb;
        while(curr != null){
            ListNode nex = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nex;
        }
        
        nb = prev;
        while(na != null){
            if(na.val != nb.val){
                return false;
            }
            na = na.next;
            nb = nb.next;
        }
        return true;
    }
}
