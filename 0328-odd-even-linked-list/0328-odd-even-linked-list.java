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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        ListNode temp = head;

        while(odd.next != null && even.next != null ) {
          odd.next = odd.next.next;
          even.next = even.next.next;
          odd = odd.next;
          even = even.next;

          if(odd.next == null || odd.next.next == null) {
            temp = odd;
          }
        }
        
        temp.next = evenHead;
        return head;
    }
}