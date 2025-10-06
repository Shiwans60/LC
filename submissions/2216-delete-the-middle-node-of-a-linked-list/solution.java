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
    public ListNode deleteMiddle(ListNode head) {
        ListNode n = head;
        int size = 0;
        while(n != null){
            size++;
            n = n.next;
        }
        int i  = 0;
        n = head;
        if(size == 1){
            
            return null;
        }
        if(size == 2){
            n.next = null;
            return head;
        }
    
    
        while(i < size/2 - 1 ){
            i++;
            n = n.next;
        }
        n.next = n.next.next;
        return head; 
        
    }
}
