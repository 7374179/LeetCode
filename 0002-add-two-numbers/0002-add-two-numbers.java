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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num=0;
        ListNode l3 = new ListNode();
        ListNode curr = l3;

        while(l1!=null&&l2!=null){
            int sum = l1.val + l2.val+num;
            num=sum/10;
            sum=sum%10;
            curr.next = new ListNode(sum);
            l1=l1.next;
            l2=l2.next;
            curr=curr.next;
        }       
        if(l1!=null){
            while(l1!=null){
                int sum = l1.val+num;
                num=sum/10;
                sum=sum%10;
                curr.next=new ListNode(sum);
                l1=l1.next;
                curr=curr.next;
            }
        } 
        if(l2!=null){
            while(l2!=null){
                int sum = l2.val+num;
                num=sum/10;
                sum=sum%10;
                curr.next=new ListNode(sum);
                l2=l2.next;
                curr=curr.next;
            }
        } 
        if(num==1){
            curr.next=new ListNode(1);
        }
        return l3.next;
    }
}