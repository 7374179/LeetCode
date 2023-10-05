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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> map = new TreeMap<>();
        ListNode node = new ListNode();
        node = head;
        while(node!=null){
            map.put(node.val, map.getOrDefault(node.val, 0)+1);
            node=node.next;
        }
        ListNode newNode = new ListNode(-1);
        ListNode tmp = newNode;

        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                continue;
            }
            tmp.next = new ListNode(entry.getKey());
            tmp=tmp.next;
        }

        return newNode.next;
    }
}
