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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        Queue<Integer> que = new LinkedList<>();
        ListNode one = list1;
        ListNode two = list2;
        int count=0;
        while(one!=null){
            if(count<a || b<count){
                que.add(one.val);
            }else{
                while(two!=null){
                    que.add(two.val);
                    two=two.next;
                }
            }
            count++;
            one=one.next;
        }
        ListNode list = new ListNode(0);
        ListNode curr = list;
        ListNode head= curr;
        while(!que.isEmpty()){
            ListNode listNode = new ListNode(que.poll());
            curr.next=listNode;
            curr=curr.next;
        }
        return head.next;
    }
}