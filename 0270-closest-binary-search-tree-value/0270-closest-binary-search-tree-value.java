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
    public int closestValue(TreeNode root, double target) {
        TreeNode node = root;
        double tmp = Double.MAX_VALUE;
        int value = 0;
        while(node!=null){
            if(node.val<target){
                if(tmp>=target-node.val){
                    tmp = target-node.val;
                    value =  node.val;
                }
                node = node.right;
            }else{                
                if(tmp>=node.val - target){
                    tmp = node.val - target;
                    value =  node.val;

                }
                node = node.left;
            }
        }
        return value;
    }
}