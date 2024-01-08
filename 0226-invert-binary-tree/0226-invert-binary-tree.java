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
    Stack<TreeNode> stackLeft = new Stack<>();
    Stack<TreeNode> stackRight = new Stack<>();
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        stackLeft.push(root.left);
        stackRight.push(root.right);
        root.left=stackRight.pop();
        root.right=stackLeft.pop();
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}