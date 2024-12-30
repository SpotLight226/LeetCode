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
        ListNode node = null; // 다음 노드를 저장할 노드

        while(head != null) {
            ListNode temp = head.next; // 임시 노드에 다음 노드를 저장
            head.next = node; 
            node = head;
            head = temp;
        }

        return node;
    }
}