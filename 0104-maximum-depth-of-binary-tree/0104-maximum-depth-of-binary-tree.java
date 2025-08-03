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
    public int maxDepth(TreeNode root) {
        // 현재 트리가 null 이면 해당 트리는 없으므로, 0
        if (root == null) return 0;

        // 현재 트리가 null 이 아닐 때, 깊이는+ 1 (현재 트리) + 왼쪽, 오른쪽 을 나누어서 재귀로 계산
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}