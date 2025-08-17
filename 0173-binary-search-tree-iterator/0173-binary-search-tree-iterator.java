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
class BSTIterator {
    private Stack<TreeNode> stack;
    private TreeNode node;

    public BSTIterator(TreeNode root) {
        stack = new Stack();
        node = root;
    }
    
    public int next() {
        while(node != null) {
            stack.push(node);
            node = node.left;
        }

        node = stack.pop();
        int result = node.val;
        node = node.right;
        return result;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty() || node != null;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */