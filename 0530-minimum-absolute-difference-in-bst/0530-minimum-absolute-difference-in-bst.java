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
    List<Integer> list = new ArrayList<Integer>();

    public int getMinimumDifference(TreeNode root) {
        int min=Integer.MAX_VALUE;
        helper(root);
        Collections.sort(list);

        for(int i=1;i<list.size();i++){
            if((list.get(i)-list.get(i-1))<min){
                min=list.get(i)-list.get(i-1);
            }
        }
        
        return min;
    }

    public void helper(TreeNode root){
        if(root==null){
            return;
        }
            list.add(root.val);
            helper(root.left);
            helper(root.right);
    }
}