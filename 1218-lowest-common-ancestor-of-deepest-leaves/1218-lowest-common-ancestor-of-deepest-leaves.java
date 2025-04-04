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
    private TreeNode dfs(TreeNode root, int max, int len) {
        if(root == null) {
            return null;
        }

        if(max - 1 == len) {
            return root;
        }

        TreeNode left = dfs(root.left, max, len + 1);
        TreeNode right = dfs(root.right, max, len + 1);

        if(left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return 0; // 뿌리가 없으면 0
        // 재귀 함수를 돌려서, 왼쪽, 오른쪽 으로 나누어 반복해 가장 깊은 노드의 깊이를 리턴
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int max = maxDepth(root); // 가장 깊은 노드
        return dfs(root, max, 0);
    }
}