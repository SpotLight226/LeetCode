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
        
        // 다음 루트에 따라, target에서 현재 값을 뺀 값과 같은지 확인 (재귀)
        boolean leftSum = hasPathSum(root.left, targetSum - root.val);
        boolean rightSum = hasPathSum(root.right, targetSum - root.val);

        // leftSum 과 rightSum 이 target과 같은지 확인
        return (leftSum || rightSum);
    }
}