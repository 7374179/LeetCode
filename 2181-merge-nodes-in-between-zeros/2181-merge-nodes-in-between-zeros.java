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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        Queue<Integer> que = new LinkedList<>();
        ListNode curr = head.next;
        while(curr != null){
            if(curr.val == 0){
                que.add(sum);
                sum = 0;
            }
            sum = sum + curr.val;
            curr = curr.next;
        }
        ListNode node = head;
        int len = que.size();
        while(!que.isEmpty()){
            node.val = que.poll();
            node = node.next;
            if(que.isEmpty()){
                ListNode current = head;
                for(int i=1;i<len && current !=null; i++){
                    current = current.next;
                }
                if(current!=null){
                    current.next = null;
                }
            }
        }
        return head;
    }
}