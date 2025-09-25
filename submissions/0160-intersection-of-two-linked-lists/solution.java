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
        
        ListNode res = null;
        while(na != null){
            ListNode nb = headB;
            while(nb != null){
                if (na == nb ){
                    return na;
                    
                }
                
                nb = nb. next;
            }
            na = na.next;
        }
        return res;
    }
}
