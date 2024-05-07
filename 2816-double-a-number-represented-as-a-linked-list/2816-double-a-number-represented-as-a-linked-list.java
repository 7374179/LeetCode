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
    public ListNode doubleIt(ListNode head) {
        ListNode tmp = head;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        while(tmp!=null){
            stack1.push(tmp.val);
            tmp = tmp.next;
        }

        int count = 0;
        while(!stack1.isEmpty()){
            int num = stack1.pop();
            num = num*2;
            if(count==1){
                stack2.push(count+num%10);
            }else{
                stack2.push(num%10);
            }
            if(num>9){
                count = 1;
            }else{
                count = 0;
            }
        }
        if(count==1){
            stack2.push(1);
        }

        head = new ListNode(stack2.pop());
        tmp = head;
        while(!stack2.isEmpty()){
            tmp.next = new ListNode(stack2.pop());
            tmp = tmp.next;
        }
        return head;
    }
}