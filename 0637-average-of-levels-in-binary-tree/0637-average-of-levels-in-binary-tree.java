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
    public List<Double> averageOfLevels(TreeNode root) {
        // 결과를 저장할 List
        List<Double> result = new ArrayList<>();
        if(root == null) return result;

        // 계산에 사용할 queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // queue 가 비어있지 않을 때까지
        while(!queue.isEmpty()) {
            // 현재 레벨에서의 노드 개수
            int size = queue.size();
            double sum = 0;

            for(int i = 0; i < size; i++) {
                // sum 에 node 의 값을 넣기
                TreeNode node = queue.poll();
                sum += node.val;

                // 현재 node 에서 왼쪽, 오른쪽이 비어있지 않다면, queue 에 넣기
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }

            // result List 에 현 레벨에서의 합 / 현 레벨의 개수 를 넣기
            result.add(sum / size);
        }

        return result;
    }
}