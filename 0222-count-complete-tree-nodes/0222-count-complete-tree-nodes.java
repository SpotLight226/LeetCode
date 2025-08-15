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
    // 트리를 세는 메서드
    // 현재 노드가 null 이라면, 추가한 현재 노드를 빼고(-1)
    // 아니라면, 현재 노드 넣고(+1), 옆의 노드로 이동
    int height(TreeNode root) {
        return root == null ? -1 : 1 + height(root.left);
    }

    public int countNodes(TreeNode root) {
        int nodes = 0;
        int h = height(root);

        while(root != null) {
            if (height(root.right) == h - 1) {
                nodes += 1 << h;
                root = root.right;
            } else {
                nodes += 1 << h -1;
                root = root.left;
            }
            h--;
        }
        return nodes;
    }
}