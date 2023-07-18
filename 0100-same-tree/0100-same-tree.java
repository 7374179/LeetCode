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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result1=true;
        boolean result2=true;
        if((p!=null && q==null) || p==null && q!=null){
            return false;
        }else if(p==null && q==null){
            return true;
        }
        

        if(p.val!=q.val){
            return false;
        }else{
            if(p.left!=null||q.left!=null){
                result1 = isSameTree(p.left, q.left);
            }
            if(p.right!=null||q.right!=null){
                result2 = isSameTree(p.right, q.right);
            }
        }



        return result1 && result2;

    }
}