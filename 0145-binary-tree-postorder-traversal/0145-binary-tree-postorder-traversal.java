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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        dfs(root, answer);
        return answer;
    }

    private void dfs(TreeNode node, List<Integer> answer) {
        if(node == null) return; // 해당 노드가 null 이면 dfs 종료

        dfs(node.left, answer); // 왼쪽 트리부터 dfs
        dfs(node.right, answer); // 오른쪽 트리
        answer.add(node.val); // 가장 끝의 노드부터 answer 리스트에
    }
}