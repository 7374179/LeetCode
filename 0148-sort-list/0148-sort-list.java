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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode list = new ListNode();
        list = head;
        while(list!=null){
            pq.add(list.val);            
            list=list.next;
        }
        ListNode newList = new ListNode(-1);
        newList.next=head;
        while(!pq.isEmpty()){
            head.val=pq.remove();
            head=head.next;
        }
        return newList.next;
    }
}