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
    public ListNode removeNthFromEnd(ListNode head, int n) {
   
      ListNode p=head;
      ListNode q=head;
      int size=0;

      ListNode temp=head;
      while(temp!=null){
        temp=temp.next;
        size++;
      }

      if(size==1){
        head=null;
        return head;
      }
      int i=0;
      while((size-i)!=n){
        q=p;
        p=p.next;
        i++;

      }
     if(p==q){
        head=head.next;
        return head;
     }
      q.next=p.next;
     

      return head;
    }
}
