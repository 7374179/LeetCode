
//   Definition for singly-linked list.
//   public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Queue<Integer> que = new LinkedList<>();
        ListNode list = head;
        int count=0;
        while(list!=null){
            count++;
            que.add(list.val);
            list=list.next;
        }
        ListNode newList = new ListNode(-1);
        ListNode tmp = newList;
        newList = tmp;
        n=count-n;
        while(!que.isEmpty()){
            if(n!=0){
                tmp.next=new ListNode(que.poll());
                if(que.isEmpty()){
                    break;
                }
                // tmp.next=new ListNode();
                tmp=tmp.next;
                
            }else{
                que.poll();
            }
            n--;
            if(que.isEmpty()){
                break;
            }
        }
        return newList.next;

    //         ListNode dummy = new ListNode(-1);
    // dummy.next = head;

    // ListNode first = dummy;
    // ListNode second = dummy;

    // // Move first pointer n nodes ahead
    // for (int i = 1; i <= n + 1; i++) {
    //     first = first.next;
    // }

    // // Move first to the end, maintaining the gap
    // while (first != null) {
    //     first = first.next;
    //     second = second.next;
    // }

    // // Remove the nth node from the end
    // second.next = second.next.next;

    // return dummy.next;
    }
}
