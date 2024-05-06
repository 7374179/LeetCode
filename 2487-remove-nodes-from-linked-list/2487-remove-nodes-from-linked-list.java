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
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        ListNode tmp = head;
        while(tmp!=null){
            stack.push(tmp.val);
            tmp = tmp.next;
        }
        int max = stack.pop();
        int count = stack.size();
        stack2.push(max);
        while(!stack.isEmpty()){
            int num = stack.pop();
            if(num>=max){
                max = num;
                stack2.add(num);
                if(num>max && stack.size()+1==count){
                    stack2.pop();
                }
            }
        }
        head = new ListNode(stack2.pop());
        ListNode curr = head;
        while(!stack2.isEmpty()){
            curr.next = new ListNode(stack2.pop());
            curr = curr.next;
        }
        return head;
    }
}