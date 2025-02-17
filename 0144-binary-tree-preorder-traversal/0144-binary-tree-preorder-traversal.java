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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        dfs(root, answer);
        return answer;
    }

    private void dfs(TreeNode node, List<Integer> answer) {
        if(node == null) return; // 해당 노드가 null 이면 dfs 종료

        answer.add(node.val); // 현재 노드의 값을 answer 리스트에
        dfs(node.left, answer); // 왼쪽 트리부터 dfs
        dfs(node.right, answer); // 오른쪽 트리
    }
}