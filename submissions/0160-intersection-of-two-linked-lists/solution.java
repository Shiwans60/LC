/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode na = headA;
        ListNode nb = headB;
        
        if(headA == null || nb == null){
            return null;
        }
        while(na != nb){
            if( na == null){
                na = headB;
            }
            else{
                na = na.next;
            }
            if( nb == null){
                nb = headA;
            }
            else{
                nb = nb.next;
            }
        }
        return na;
    }
}
