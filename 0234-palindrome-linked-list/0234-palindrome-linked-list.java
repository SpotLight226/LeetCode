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
    public boolean isPalindrome(ListNode head) {
        // 투포인터로 비교하기 위해서 list생성
        List<Integer> list = new ArrayList<>();

        // 모든 요소를 list에 넣기
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        // 포인터
        int l = 0; // 시작
        int r = list.size() - 1; // 끝

        while(l < r) {
            // 대칭으로 비교하면서 요소들이 대칭인지를 확인
            if(!list.get(l).equals(list.get(r))) {
                return false;
            }
            // 포인터 이동
            l++;
            r--;
        }

        return true;
    }
}