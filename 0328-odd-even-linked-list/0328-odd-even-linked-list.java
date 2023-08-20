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
    public ListNode oddEvenList(ListNode head) {
        Queue<Integer> que = new LinkedList<>();
        ListNode p1 = head;
        ListNode p2 = p1;

        while(head!=null && head.next!=null){
            que.add(head.next.val);
            p1.next=p1.next.next;
            if(p1.next==null){
                break;
            }
            p1=p1.next;
            head=head.next;
        }
        while(!que.isEmpty()){
            p1.next=new ListNode(que.poll());
            p1=p1.next;
        }

        return p2;
    }
}