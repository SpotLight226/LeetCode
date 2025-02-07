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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null) return null;

        if(root.val == val) { // 찾는 값이라면 리턴
            return root;
        } else if (root.val > val) { // 현재 값이 찾는 값보다 크다면, 왼쪽 값 찾기
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}