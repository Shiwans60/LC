/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode na = head;
        HashMap<ListNode, Integer> h = new HashMap<>();
        if(head == null){
            return null;
        }
        
        while(!h.containsKey(na)){
            
            h.put(na,1);
            na = na.next;
            if(na == null){
                return null;
            }
        }
        return na;
        
        
        
    }
}
