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
    public ListNode partition(ListNode head, int x) {
        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();

        while(head!=null){
            if(head.val >= x){
                que2.add(head.val);
            }else{
                que1.add(head.val);
            }
            head=head.next;
        }
        ListNode node = new ListNode(-1);
        ListNode tmp = node;

        while(!que1.isEmpty() || !que2.isEmpty()){
            if(!que1.isEmpty()){
                tmp.next=new ListNode(que1.poll());
            }else{
                tmp.next=new ListNode(que2.poll());
            }
            tmp=tmp.next;
        }
        return node.next;
    }
}