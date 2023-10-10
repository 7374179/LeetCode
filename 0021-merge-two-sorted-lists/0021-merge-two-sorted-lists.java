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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        while(list1!=null){
            que.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null){
            que.add(list2.val);
            list2=list2.next;
        }
        ListNode head = new ListNode(-1);
        ListNode curr = head;
        while(!que.isEmpty()){
            curr.next=new ListNode(que.poll());
            curr=curr.next;
        }
        return head.next;
    }
}
