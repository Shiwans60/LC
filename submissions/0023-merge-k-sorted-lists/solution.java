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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> a - b);
        for(int i = 0 ; i < lists.length; i++){
            ListNode k = lists[i];
            while(k != null){
                pq.offer(k.val);
                k = k.next;
            }
        }
        if(pq.isEmpty()){
            return null;
        }
        int n = pq.size();
        ListNode l = new ListNode(pq.poll()); 
        ListNode curr = l;
        for(int i = 1; i < n ;i++){
            curr.next = new ListNode(pq.poll());
            curr = curr.next;
        }
        
        return l;
    }
}
