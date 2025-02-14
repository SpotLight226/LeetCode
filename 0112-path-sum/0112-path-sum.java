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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false; // 루트 자체가 null 이면 그대로 false

        // 트리에 루트 만 있다면 루트의 값과 타겟이 같은 지에 따라 리턴
        if(root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        boolean leftSum = hasPathSum(root.left, targetSum - root.val);
        boolean rightSum = hasPathSum(root.right, targetSum - root.val);

        return (leftSum || rightSum);
    }
}