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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;

        if(height(root) == -1) return false;

        return true;
    }
    // 재귀 함수
    private int height(TreeNode root) {
        if(root == null) return 0;

        int leftHeight = height(root.left); // 왼쪽의 높이
        int rightHeight = height(root.right); // 오른쪽의 높이

        if(leftHeight == -1 || rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}