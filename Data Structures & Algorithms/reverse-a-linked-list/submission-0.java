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
        if(head==null){
            return head;
        }
        ListNode p=head.next;
        head.next=null;
        ListNode curr=p;
        while(curr!=null){
            p=p.next;
            curr.next=head;
            head=curr;
            curr=p;
        }
       return head;

    }
}
