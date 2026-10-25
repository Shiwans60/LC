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
    public int numComponents(ListNode head, int[] nums) {
        ListNode na = head;
        int comp = 0;
        Set<Integer> s = new HashSet<>();
        for(int num : nums){
            s.add(num);
        }
        while(na != null){
           if(s.contains(na.val) && (na.next == null || !s.contains(na.next.val))){
            comp++;
           }
           na = na.next;
        }
        return comp;
        
    }
}
