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
        if(root == null) return null;

        // 임시 노드에 left 값을 저장 후, 자리 바꾸기
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // 메서드에 left, right 를 넣어서 root 취급해서 재귀 
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}