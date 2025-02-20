/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        // A + B 와 B + A 를 비교한다
        // A + B 와 B + A 는 후반부가 결합된 리스트의 후반부와 동일하다
        // A + B = 4 -> 1 -> 8 -> 4 -> 5 -> 5 -> 6 -> 1 -> 8 -> 4 -> 5
        // B + A = 5 -> 6 -> 1 -> 8 -> 4 -> 5 -> 4 -> 1 -> 8 -> 4 -> 5
        while(a != b) {
            if(a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            if(b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        return a;
    }
}