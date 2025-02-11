/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true; // root 가 null 이면 그대로 true 리턴

        return isMirror(root.left, root.right);
    }

    // 일단 root 의 왼쪽, 오른쪽 노드를 비교
    private boolean isMirror(TreeNode n1, TreeNode n2) {
        if(n1 == null && n2 == null) return true; // 둘 다 null 이면 root 만 있다는 것이므로 true

        if(n1 == null || n2 == null) return false; // 둘 중 하나가 null 이면 대칭 아님

        // 왼쪽, 오른쪽 노드가 같다면, 각 노드 들의 왼쪽, 오른쪽을 비교
        return n1.val == n2.val && isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
    }
}