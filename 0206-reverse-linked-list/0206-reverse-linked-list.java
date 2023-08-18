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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head!=null){
            stack.add(head.val);
            head=head.next;
        }
        ListNode list = new ListNode(-1);
        ListNode tmpList = list;
        while(!stack.isEmpty()){
            int tmp = stack.pop();
            tmpList.next = new ListNode(tmp);
            tmpList = tmpList.next;
        }
        return list.next;
    }
}

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode curr = head;
//         while (curr != null) {
//             ListNode nextTemp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nextTemp;
//         }
//         return prev;
//     }
// }

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         if (head == null || head.next == null) {
//             return head;
//         }
//         ListNode p = reverseList(head.next);
//         head.next.next = head;
//         head.next = null;
//         return p;
//     }
// }