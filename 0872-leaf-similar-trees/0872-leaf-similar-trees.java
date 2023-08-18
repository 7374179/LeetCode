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
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        checked(root1, list1);
        checked(root2, list2);

        if(list1.size() != list2.size()){
            return false;
        }

        int leaf = 0;
        while(leaf<list1.size()){
            if(list1.get(leaf)!=list2.get(leaf)){
                return false;
            }
            leaf++;
        }

        return true;

        
    }
    private void checked(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        } else if(root.left==null && root.right==null){
            list.add(root.val);
        }
        checked(root.left, list);
        checked(root.right, list);
    }
}