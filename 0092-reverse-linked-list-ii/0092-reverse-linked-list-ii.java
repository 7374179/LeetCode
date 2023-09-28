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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Stack<Integer> stack = new Stack<>();
        int count = 1;
        ListNode list = new ListNode();
        list = head;
        int i=0;
        while(list!=null){
            if(count>=left && count<=right){
                stack.add(list.val);
            }
            count++;
            list=list.next;
        }
        count=1;
        ListNode list1 = new ListNode(-1);
        list1.next=head;

        while(head!=null){
            if(count>=left && count<=right){
                head.val=stack.pop();
            }
            count++;
            head=head.next;
        }
        return list1.next;
    }
}