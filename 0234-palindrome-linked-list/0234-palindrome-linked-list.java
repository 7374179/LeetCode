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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        int count=0;
        while(node!=null){
            count++;
            node=node.next;
        }
        node=head;
        for(int i=0;i<count/2;i++){
            stack.add(node.val);
            node=node.next;
        }
        if(count%2==1){
            node=node.next;
        }
        while(!stack.isEmpty()){
            if(node.val!=stack.pop()){
                return false;
            }
            node=node.next;
        }
        return true;
    }
}
