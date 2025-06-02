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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        String str = "";

        binaryTree(root, list, str);
        return list;
    }

    void binaryTree(TreeNode root, ArrayList<String> list, String str) {
        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            str += root.val;
            list.add(str);
            str = "";
            return;
        }

        str += root.val;
        str += "->";

        if(root.left != null) {
            binaryTree(root.left,list, str);
        }

        if(root.right != null) {
            binaryTree(root.right, list, str);
        }
    }
}