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
    public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(0, head);
        ListNode dummy = result;

        // 마지막 까지 반복
        while (dummy != null) {
            // 다음이 null이 아니고, 다음 값(val)이 val와 같다면
            while (dummy.next != null && dummy.next.val == val) {
                dummy.next = dummy.next.next; // 바꿔주기
            } 
            dummy = dummy.next;
        }

        return result.next;
    }
}