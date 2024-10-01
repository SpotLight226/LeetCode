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

    public TreeNode checkTree(int[] nums, int s, int e){
        if(s > e) return null;

        int m = s + (e - s) / 2; // 중간 값(반올림을 막기위해 s + (e - s) / 2)
        TreeNode node = new TreeNode(nums[m]);
        node.left = checkTree(nums, s, m - 1);
        node.right = checkTree(nums, m + 1, e);
        return node;
    }


    public TreeNode sortedArrayToBST(int[] nums) {
        int l = nums.length;
        if(l == 0) return null;
        
        return checkTree(nums, 0, l - 1);
    }
}