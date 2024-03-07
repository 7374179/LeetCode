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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode tmp = head;
        while(tmp!=null){
            count++;
            tmp=tmp.next;
        }
        int mid = count/2;
        tmp=head;
        count=0;
        while(mid!=count){
            count++;
            tmp=tmp.next;
        }
        return tmp;
    }
}