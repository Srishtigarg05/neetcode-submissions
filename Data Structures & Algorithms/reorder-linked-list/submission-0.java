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
    public void reorderList(ListNode head) {
        
        ListNode temp=head;
        while(temp.next!=null && temp.next.next!=null){
            ListNode p=temp.next;
            ListNode q=temp;
            while(p.next!=null){
                q=p;
                p=p.next;

            }
            p.next=temp.next;
            temp.next=p;
            temp=temp.next.next;
            q.next=null;


        }

        
    }
}
