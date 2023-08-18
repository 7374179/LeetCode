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
        ListNode node = head;
        int count = 0;
        while(node!=null){
            if(node!=null){
                count++;
            }
            node=node.next;
        }
        int mid = count/2;
        count=0;
        ListNode node1=new ListNode(-1);
        ListNode node2=node1;

        while(head!=null){
            if(count==mid){
                if(head.next==null){
                    break;
                }
                node1.next=new ListNode(head.next.val);
                count++;
                head=head.next.next;
                node1=node1.next;
                continue;
            }
            node1.next = new ListNode(head.val);
            head=head.next;
            node1=node1.next;
            count++;
        }
        return node2.next;
    }
}