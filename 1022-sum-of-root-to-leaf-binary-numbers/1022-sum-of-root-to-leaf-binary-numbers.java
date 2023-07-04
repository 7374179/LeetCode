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
        List<String> list;
        int sum;
    public int sumRootToLeaf(TreeNode root) {
        sum=0;
        list = new ArrayList<>();
        if(root==null){
            return 0;
        }

        traverse(root, "");

        for(int i=0;i<list.size();i++){
            int num = Integer.parseInt(list.get(i),2);
            sum+=num;
        }
        return sum;
    }

    private void traverse(TreeNode root, String tmp){
        if(root==null){
            return;
        }

        tmp = tmp+root.val+"";
        if(root.left==null&&root.right==null){
            list.add(tmp);
        }
        traverse(root.left, tmp);
        traverse(root.right, tmp);
    }
}