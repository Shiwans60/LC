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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode na = dummy;
        Set<Integer> s = new HashSet<>();
        for(int num : nums){
            s.add(num);
        }
        
        while(na.next != null){
            if(s.contains(na.next.val)){
                na.next = na.next.next;
            }
            else{
                na = na.next;
            }
            
        }
        return dummy.next;
        
    }
}
