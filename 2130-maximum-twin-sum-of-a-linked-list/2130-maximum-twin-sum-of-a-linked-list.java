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
    public int pairSum(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode list = head;
        int count=0;
        int max = 0;
        while(list!=null){
            list=list.next;
            count++;
        }
        list=head;
        for(int i=0;i<count;i++){
            if(i<count/2){
                stack.add(list.val);
                list = list.next;
            }else{
                max = Math.max(max, list.val+stack.pop());
                list=list.next;
            }
        }
        return max;
    }
}