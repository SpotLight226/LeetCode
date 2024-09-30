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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true; // 둘 다 null 이라면 같다

        if(p == null || q == null) return false; // 둘 중 하나가 null이라면 다르다

        if(p.val != q.val) return false; // 시작 노드가 다르면 false

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); // 왼쪽, 오른쪽 노드를 비교
    }
}