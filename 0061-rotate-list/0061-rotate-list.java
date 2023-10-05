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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        Deque<Integer> que = new LinkedList<>();
        ListNode list = new ListNode();
        list=head;
        int count=0;
        while(list!=null){
            que.add(list.val);
            list=list.next;
            count++;
        }
        int newK = k%count;
        for(int i=0;i<newK;i++){
            que.addFirst(que.removeLast());
        }
        ListNode newList = new ListNode(-1);
        ListNode tmp = newList;
        while(!que.isEmpty()){
            tmp.next = new ListNode(que.removeFirst());
            tmp=tmp.next;
        }
        return newList.next;

    }
}