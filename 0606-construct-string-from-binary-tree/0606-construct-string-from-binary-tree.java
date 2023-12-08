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
    String str = "";
    public String tree2str(TreeNode root) {
        if(root==null){
            return str;
        }

        str=str+root.val;
        if(root.left!=null || root.right!=null){
          str=str+"(";
        }

        if(root.left==null&&root.right!=null){
          str= str+")";
        }

        tree2str(root.left);
        
        if(root.right!=null){
            str=str+"(";
        }
        tree2str(root.right);
        str=str+")";

        return str.substring(0,str.length()-1);
    }
}