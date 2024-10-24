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
    public TreeNode invertTree(TreeNode root) {
        // 재귀 방식
        // 노드가 null이면 리턴 null
        if(root == null) {
            return null;
        }

        // 왼쪽, 오른쪽 노드가 null이 아니라면, 재귀로 각 노드를 넣는다
        if(root.left != null) {
            invertTree(root.left);
        }

        if(root.right != null) {
            invertTree(root.right);
        }

        // 노드 위치 변경
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root; // 리턴
    }
}